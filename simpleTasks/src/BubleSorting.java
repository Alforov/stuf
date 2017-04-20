import java.util.Random;

/**
 * Created by mikhail_alferov on 19.04.2017.
 */
public class BubleSorting {
    public static void main(String[] args) {
        int[] array = new int[10];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(20);
            System.out.print(array[i] + " ");
        }
          bubleSort(array);
        ShakeSorting.printArray(array);

    }

    public static void bubleSort(int[] array){
        boolean notSorted = true;
        int n = 0;
        while (notSorted) {
            notSorted = false;
            for (int i = 0; i < array.length - 1 - n; i++) {
                if (array[i] > array[i + 1]) {
                    notSorted = true;
                    int temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                }
            }
            n++;
        }
    }
}
