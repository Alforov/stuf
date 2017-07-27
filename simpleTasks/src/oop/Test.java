package oop;

import java.util.List;
import java.util.concurrent.*;
import java.util.logging.Logger;
import java.util.stream.IntStream;

import static java.util.stream.Collectors.toList;

/**
 * Created by mikhail_alferov on 26.04.2017.
 */
public class Test {
    private static ExecutorService executor =
            Executors.newCachedThreadPool();
    private static Logger LOGGER = Logger.getLogger("test");

    public static void main(String[] args)
            throws ExecutionException, InterruptedException {
        List<MyTask> tasks = IntStream.range(0, 10)
                .mapToObj(i -> new MyTask(1))
                .collect(toList());
        runSequentially(tasks);
        useParallelStream(tasks);
        useCompletableFutureWithExecutor(tasks);

    }

    public static void runSequentially(List<MyTask> tasks) {
        long start = System.nanoTime();
        List<Integer> result = tasks.stream()
                .map(MyTask::calculate)
                .collect(toList());
        long duration = (System.nanoTime() - start) / 1_000_000;
        System.out.printf("Processed %d tasks in %d millis\n", tasks.size(), duration);
        System.out.println(result);
    }

    public static void useParallelStream(List<MyTask> tasks) {
        long start = System.nanoTime();
        List<Integer> result = tasks.parallelStream()
                .map(MyTask::calculate)
                .collect(toList());
        long duration = (System.nanoTime() - start) / 1_000_000;
        System.out.printf("Processed %d tasks in %d millis\n", tasks.size(), duration);
        System.out.println(result);
    }

    public static void useCompletableFutureWithExecutor(List<MyTask> tasks) {
        long start = System.nanoTime();
        ExecutorService executor = Executors.newFixedThreadPool(Math.min(tasks.size(), 10));
        List<CompletableFuture<Integer>> futures =
                tasks.stream()
                        .map(t -> CompletableFuture.supplyAsync(t::calculate, executor))
                        .collect(toList());

        List<Integer> result =
                futures.stream()
                        .map(CompletableFuture::join)
                        .collect(toList());
        long duration = (System.nanoTime() - start) / 1_000_000;
        System.out.printf("Processed %d tasks in %d millis\n", tasks.size(), duration);
        System.out.println(result);
        executor.shutdown();
    }

    private static void test() throws InterruptedException, ExecutionException {
        CompletableFuture promise = CompletableFuture
                .supplyAsync(() -> {
                    System.out.println("Action ran in: " +
                            Thread.currentThread().getName());
                    return 12;
                }, executor);
        int completedFuture = (int) promise.get();
        System.out.println("The new CompletableFuture: " +
                completedFuture);
        executor.shutdown();
    }

    private static void test1() throws InterruptedException {
        CompletableFuture
                .supplyAsync(() -> {
                    LOGGER.info("CF created in: " +
                            Thread.currentThread().getName());
                    return "XER";
                }, executor)
                .thenApply(result -> {
                    LOGGER.info("Action on CF ran in: " +
                            Thread.currentThread().getName());
                    return result.concat("XXXX");
                })
                .thenApplyAsync(result -> {
                    LOGGER.info("Another action ran in: " +
                            Thread.currentThread().getName());
                    return result.length();
                }, executor)
                .thenAccept(System.out::println);

        long timeout = 2000;
        executor.awaitTermination(timeout, TimeUnit.MILLISECONDS);
        executor.shutdown();
    }

}
