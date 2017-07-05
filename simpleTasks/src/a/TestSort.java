package a;

import b.BubleSorting;
import b.ShakeSorting;

import java.util.Random;

public class TestSort {

    public static void main(String[] args) {
        int[] array = new int[100000];
        int[] array1 = new int[100000];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            int value = random.nextInt();
            array[i] = value;
            array1[i] = value;
         //   System.out.print(array[i] + " ");
        }

        long l = System.currentTimeMillis();
        BubleSorting.bubleSort(array);
        System.out.println("\n--------");
        System.out.println(System.currentTimeMillis()-l);
        long l1 = System.currentTimeMillis();
        ShakeSorting.shakeSort(array1);
        System.out.println("--------");
        System.out.println(System.currentTimeMillis()-l1);
    }
}
