package com.luxoft.basics.part3.xtasks;

import java.util.Arrays;

public class T1_Sort
{
    public static void main(String[] args) throws Exception
    {
        int[] numbers = {0, 3, 2, 1, 6, 8, 4, 7, 5, 9};

        System.out.println("Unsorted " + Arrays.toString(numbers));
        System.out.println();

        sortAsc(numbers);
        System.out.println("After sorting" + Arrays.toString(numbers));

        int[] arrToCheck = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println("Is Sorted: " + String.valueOf(Arrays.equals(arrToCheck, numbers)).toUpperCase());
    }

    /**
     *
     * Method should sort data array ascending order.
     *
     */
    public static void sortAsc(int[] data)
    {
        // TODO YOUR CODE HERE
        for (int i = 0; i < data.length-1; i++) {
            for (int j = 0; j < data.length-1; j++) {
                if (data[j] > data[j + 1]) {
                    swap(data, j, j + 1);
                }
            }
        }

    }

    /**
     *
     * Method should exchange values with idx1 and idx2 in data array.
     *
     */
    public static void swap(int[] numbers, int idx1, int idx2)    {
        // TODO YOUR CODE HERE
        int idx1Val = numbers[idx1];
        numbers[idx1] = numbers[idx2];
        numbers[idx2] = idx1Val;
    }
}
