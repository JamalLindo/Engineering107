package com.spartaglobal.Sorters;

import java.util.Arrays;

public class SplitMergeSort {
    public static void main(String[] args) {
        int[] Test = {1,2,57,21,2,3,56};
        SplitMergeArray(Test);
    }

    private static int[] SplitMergeArray(int[] FullArray) {
        // Get the two array lengths.
        int FArrayLength = FullArray.length / 2;
        int SArrayLength = FullArray.length - FArrayLength;

        // Make the new split arrays lengths.
        int [] firstArray = new int[FArrayLength];
        int [] secondArray = new int[SArrayLength];

        //Populate the new arrays.
        for (int i = 0; i < FArrayLength ; i++){

            firstArray[i] = FullArray[i];
        }
        for (int i = 0; i < SArrayLength ; i++){
            secondArray[i] = FullArray[FArrayLength + i];
        }

        return firstArray;

        // takes in a full un order array
        // takes the mid-point  divides array by two
        // makes two arrays.

        //if array length is not = 1 don't return
        //else
        //split array at the mid-point for both split arrays

        // then do the run program till all arrays are length of array
    }

    public static int[] MergedSortArray(int[] array, int [] array2){

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
