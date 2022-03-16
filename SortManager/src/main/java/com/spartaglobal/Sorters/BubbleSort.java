package com.spartaglobal.Sorters;

public class BubbleSort {

    public int[] bubbleSort(int [] numbers){

        int numLength = numbers.length;

        for (int loop = 0; loop < numLength; loop++) {
            for (int pos = 0; pos < numLength - loop - 1  ; pos++) {
                if (numbers[pos] > numbers[pos +1]) {
                    int numHolder = numbers[pos];
                    numbers[pos] = numbers[pos + 1];
                    numbers[pos + 1] = numHolder;
                }
            }
        }
        //loop to print new array
        int printLoop = numbers.length;
        for (int loop = 0; loop < printLoop; loop++ ){
            System.out.print(numbers[loop] + " ");
        }
        return numbers;
    }
}
