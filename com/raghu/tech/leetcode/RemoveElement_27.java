package com.raghu.tech.leetcode;

public class RemoveElement_27 {

    public static int removeElement(int[] nums, int val) {
        int sidx = 0;
        int eidx = nums.length - 1;
        int newArr[]=new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                newArr[sidx++] = nums[i];
            } else {
                newArr[eidx--] = '_';
            }
        }
        for (int i = 0; i < nums.length - 1; i++) {
            nums[i]=newArr[i];
        }
        return sidx;
    }

    public static void main(String[] args) {
        int nums[]={0,1,2,2,3,0,4,2};
        int val=2;
        removeElement(nums,val);
    }
}