package com.raghu.tech.sort;

import java.util.Arrays;

//SELECTION SORT SELECTS ONE ELEMENT AT A TIME COMPARES IT TO ALL OTHER ELEMENTS IN THE LIST
//THE CORRECT POSITION FOR THAT SELECTED ELEMENT IS FOUND BEFORE MOVING ON TO THE NEXT ELEMENT
public class SelectioSort {

    public static void selectionSort(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if(arr[i]>arr[j]){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
            System.out.println("Selection Itertaion "+i+" "+Arrays.toString(arr));
        }
    }
}
