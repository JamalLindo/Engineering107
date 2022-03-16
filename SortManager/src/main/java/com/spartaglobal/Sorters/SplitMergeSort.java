package com.spartaglobal.Sorters;

import java.util.Arrays;

public class SplitMergeSort {
    public static void main(String[] args) {
        SplitArray();
    }

    private static void SplitArray() {
        // takes in a full un order array
        // takes the mid-point  divides array by two
        // makes two arrays.

        //if array length is not = 1 don't return
        //else
        //split array at the mid-point for both split arrays

        // then do the run program till all arrays are length of array
    }

    public static int[] MergedArray(int[] array, int [] array2){

        //get the length of all arrays including final.
        int arr1Length = array.length;
        int arr2Length = array2.length;
        int arrFLength = arr1Length + arr2Length;

        int[] FullArray = new int[arrFLength];

        for (int i = 0; i < arr1Length ; i++){
            FullArray[i] = array[i];
        }

        for (int i = 0; i < arr1Length ; i++){
            FullArray[arr1Length + i] = array2[i];
        }
        System.out.println(Arrays.toString(FullArray));
        return FullArray;
    }

}
