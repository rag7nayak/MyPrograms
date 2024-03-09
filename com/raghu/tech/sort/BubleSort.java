package com.raghu.tech.sort;

import java.util.Arrays;

//For Each Iteration Every Element Is Compared With Its Neighbor And Swap If They Are Not In Order
public class BubleSort {
    public static void bubbleSort(int[] arr){
        if(arr==null){
            throw new IllegalArgumentException("Array Cannot be null");
        }

        for (int i = 0; i < arr.length ; i++) {
            boolean swapped=false;
            for (int j = arr.length-1; j > i ; j--) {
                if (arr[j] < arr[j-1]){
                    int temp=arr[j];
                    arr[j] =arr[j-1];
                    arr[j-1]=temp;
                    swapped=true;
                }
            }
            System.out.println(i+" "+Arrays.toString(arr));
            if(!swapped){
                break;
            }
        }
    }
}
