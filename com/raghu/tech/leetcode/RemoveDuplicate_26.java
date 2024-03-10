package com.raghu.tech.leetcode;

import java.util.Arrays;

public class RemoveDuplicate_26 {
    public static int removeDuplicates(int[] nums) {
        int resultArrFidx=0;
        int resultArrlInx= nums.length-1;
        int numArrLidx= nums.length-1;
        int resultArr[]=new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            if(i < numArrLidx) {
                if (nums[i] != nums[i + 1]) {
                    resultArr[resultArrFidx++] = nums[i];
                } else {
                    resultArr[resultArrlInx--] = '_';
                }
            }else {
                resultArr[resultArrFidx++] = nums[i];
            }
        }
        for (int i = 0; i < nums.length; i++) {
            nums[i] = resultArr[i];

        }
        System.out.println(Arrays.toString(nums));
     return resultArrFidx;
    }

    public static void main(String[] args) {
        int arr[]={0,0,1,1,1,2};
        removeDuplicates(arr);
    }
}
