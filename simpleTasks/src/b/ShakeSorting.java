package b;

import java.util.Random;

/**
 * Created by mikhail_alferov on 19.04.2017.
 */
public class ShakeSorting {
    public static void main(String[] args) {
        int[] array = new int[100];
        int[] array1 = new int[100];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            int value = random.nextInt(1000);
            array[i] = value;
            array1[i] = value;
            System.out.print(array[i] + " ");
        }

        shakeSort(array);
    }

    public static void shakeSort(int[] array) {
        boolean stright = true;
        boolean isNotSorted = true;
        int straightStart = 0;
        int straightEnd = array.length - 1;
        int backStart = array.length - 1;
        int backEnd = 1;
        long l = System.currentTimeMillis();
        while (isNotSorted) {
            isNotSorted = false;
            if (stright) {
                isNotSorted = stright(array, straightStart, straightEnd);
                straightStart++;
                straightEnd--;
            } else {
                isNotSorted = back(array, backStart, backEnd);
                backStart--;
                backEnd++;
            }
            stright = !stright;
        }
    }

    public static void printArray(int[] array) {
        System.out.println();
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    private static boolean stright(int[] array, int start, int end) {
        boolean result = false;
        for (int i = start; i < end; i++) {
            if (array[i] > array[i + 1]) {
                int temp = array[i];
                array[i] = array[i + 1];
                array[i + 1] = temp;
                result = true;
            }
        }
        return result;
    }

    private static boolean back(int[] array, int start, int end) {
        boolean result = false;
        for (int i = start; i >= end; i--) {
            if (array[i] < array[i - 1]) {
                int temp = array[i];
                array[i] = array[i - 1];
                array[i - 1] = temp;
                result = true;
            }
        }
        return result;
    }
}
