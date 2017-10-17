package blocking;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.PriorityBlockingQueue;

/**
 * Created by mikhail_alferov on 12.09.2017.
 */
public class PriorityBlockingQueueTest {
    private static final PriorityBlockingQueue<Manager> queue = new PriorityBlockingQueue<>(3);

    public static void main(String[] args) {

        createValeraThread();
        List<Manager> managers = getManagers();
        while (true) {
            int i = new Random().nextInt(managers.size() - 1);
            Manager manager = managers.get(i);
            queue.put(manager);
        }
    }

    private static void createValeraThread() {
        new Thread(new Runnable() {
            @Override
            public void run() {
                while (true) {
                    Manager poll = null;
                    try {
                        poll = queue.take();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    valeraSolveProblem(poll);
                }
            }

            private void valeraSolveProblem(Manager poll) {
                String problem = poll.getProblem();
                try {
                    Thread.sleep(new Random().nextInt(10) * 1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Valera solve the problem from:  " + problem);
                System.out.println(queue.size());
            }
        }).start();
    }

    private static List<Manager> getManagers() {
        ArrayList<Manager> managers = new ArrayList<>();

        managers.add(new Manager("xChered") {
            @Override
            public int compareTo(Manager o) {
                return 1;
            }
            @Override
            public String getProblem() {
                return   "problem from xChered";
            }
        });
        managers.add(new Manager("Sveta") {
            @Override
            public int compareTo(Manager o) {
                if (o.getName().equals("xChered")) return -1;
                else return 1;
            }

            @Override
            public String getProblem() {
                return   "problem from Sveta";
            }
        });

        managers.add(new Manager("Oksana") {
            @Override
            public int compareTo(Manager o) {
                return -1;
            }
            @Override
            public String getProblem() {
                return   "problem from Oksana";
            }
        });
        return managers;
    }


}
