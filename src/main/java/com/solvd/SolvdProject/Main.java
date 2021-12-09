package com.solvd.SolvdProject;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void bubbleSort(int[] array) {
        boolean unsorted = true;
        int temp;
        while (unsorted) {
            unsorted = false;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]) {
                    temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    unsorted = true;
                }
            }
        }
    }
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            System.out.println("Введіть к-ксть елементів масиву: ");
            int size = input.nextInt();
            int array[] = new int[size];
            System.out.println("Введіть елементи через пробіл:");

            for (int i = 0; i < size; i++) {
                array[i] = input.nextInt();
            }


            bubbleSort(array);
            System.out.println(Arrays.toString(array));
        }
    }

