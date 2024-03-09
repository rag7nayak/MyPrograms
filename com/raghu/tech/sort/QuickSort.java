package com.raghu.tech.sort;

public class QuickSort {

    public static void quickSort(int[] arr,int low,int high){
        if(low<high){
            int pidx=partition(arr,low,high);
            quickSort(arr, low, pidx-1);
            quickSort(arr,pidx+1,high);
        }
    }

    private static int partition(int[] arr, int low, int high) {
        int pivot=arr[high];
        int i=low-1;

        for (int j = low; j < high ; j++) {
            if(arr[j]<pivot) {
                i++;
                //swap
                int temp = arr[i];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }
        i++;
        int temp=arr[i];
        arr[i]=pivot;
        arr[high]=temp;
        return i;
    }
}
