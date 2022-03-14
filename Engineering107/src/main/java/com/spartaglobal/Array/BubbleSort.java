package com.spartaglobal.Array;

public class BubbleSort {

    public static void main(String[] args) {
    Array();
    }

    public static void Array(){
        int arr[] ={64, 28, 11, 92, 39, 79 ,94 ,21 ,10 ,20};
        BubbleSort run = new BubbleSort();
        run.bubbleSort(arr);
    }

    public int[] bubbleSort(int [] numbers){

        int numLength = numbers.length;

        for (int loop = 0; loop < numLength; loop++) {
            for (int pos = 0; pos < numLength - loop - 1  ; pos++) {

                if (numbers[pos] > numbers[pos +1]) {

                    int numHolder = numbers[pos]; //Create a new int to hold numbers [] at position
                    numbers[pos] = numbers[pos + 1]; //Assign variable numbers [] at position + 1 to numbers[] at position
                    numbers[pos + 1] = numHolder; //Assign placeholder to numbers[] at position + 1

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
