package com.spartaglobal.Controller;
import com.spartaglobal.Sorters.BubbleSort;
import java.util.Random;

import static com.spartaglobal.ScannerInput.ScannerInput.ScannerSort;

public class Controller {
    public static void main(String[] args) {


    }

    public static void SortController(int i){
        int choice =  i;
        if(choice == 1){
            System.out.println("you have chosen BubbleSort :" + choice);
            BubbleSort bubble = new BubbleSort();
            System.out.print(bubble.bubbleSort(new int[]{1,2,7,5,19}));
        }else if (choice == 2){
            System.out.println("you have chosen InsertionSort :" + choice);
        }else if (choice == 3){
            System.out.println("you have chosen MergeSort :" + choice);
        }else if (choice ==4 ){
            System.out.println("you have chosen QuickSort :" + choice);
        }else{
            System.out.println("you haven't chosen a choice ");
            ScannerSort();
        }
    }
    public static int[] ArrayGen(int Array){
        int ArrayLength = Array;
        int[] array = new int [ArrayLength];

        for (int i = 0; i < ArrayLength; i++) {
            Random random = new Random();
            array[i] = random.nextInt(10)+ 1;
        }
        return array;
    }
}
