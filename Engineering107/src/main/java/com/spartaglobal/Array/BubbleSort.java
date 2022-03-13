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
        //loop the amount of times there is numbers in the array.
        for (int loop = 0; loop < numLength; loop++) {
            //loop through each position per array entry. arrays start from 0 so without the -1 ,pos will become Greater than
            for (int pos = 0; pos < numLength - loop - 1  ; pos++) {
                // if number at pos is greater than number at pos + 1 continue
                if (numbers[pos] > numbers[pos +1]) {

                    // swap the two numbers
                    int numHolder = numbers[pos]; //Create a new int to hold numbers [] at position
                    numbers[pos] = numbers[pos + 1]; //Assign variable numbers [] at position + 1 to numbers[] at position
                    numbers[pos + 1] = numHolder; //Assign placeholder to numbers[] at position + 1

                    //System.out.println(numbers[pos] + " -- " + numbers[pos + 1]);
                    //System.out.println(pos +  " " + loop + " \t");
                }
            }
            //print once position has been assigned , Does not allow for last assignment as print is not complete after last loop
            //System.out.print(numbers[loop] + " ");
        }
        //System.out.println(numbers[0] + " " + numbers[1] + " " + + numbers[2] + " " + + numbers[3] + " " + + numbers[4] + " " + + numbers[5] );
        //loop to print new array
        int printLoop = numbers.length;
        for (int loop = 0; loop < printLoop; loop++ ){
            System.out.print(numbers[loop] + " ");
        }
        return numbers;
    }
}
