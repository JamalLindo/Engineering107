package com.spartaglobal.Array;
import java.util.Arrays;

public class ArraySort {
    public static void main(String[] args) {
        Array();

    }

    public static void Array(){
        int arr[] ={64, 28, 11, 92, 39};
        int arr2[] ={44, 18, 11, 93, 69};


        ArraySort FullArray = new ArraySort();
        FullArray.MergedArray(arr,arr2);


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
