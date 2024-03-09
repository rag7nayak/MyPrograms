package com.raghu.tech;

import com.raghu.tech.sort.BubleSort;
import com.raghu.tech.sort.MergeSort;
import com.raghu.tech.sort.SelectioSort;

import java.util.Arrays;
import java.util.Random;

public class Main {
    private static final int ARRAY_SIZE = 11;
    public static void main(String[] args) {
        Random rnd = new Random();
        int[] integers = new int[ARRAY_SIZE];
        for (int i = 0; i < ARRAY_SIZE; i++) {
            integers[i] = rnd.nextInt(ARRAY_SIZE);
        }
        System.out.println(Arrays.toString(integers));
       // BubleSort.bubbleSort(integers);
        System.out.println("===================");
        //SelectioSort.selectionSort(integers);
        System.out.println("===================");
        MergeSort merge=new MergeSort();
        merge.divide(integers,0, integers.length-1);
        System.out.println(Arrays.toString(integers));
    }
}
