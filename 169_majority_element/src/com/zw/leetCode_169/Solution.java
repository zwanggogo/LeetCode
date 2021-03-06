package com.zw.leetCode_169;

public class Solution {
    public int majorityElement(int[] nums) {
        //没有两个不同的元素,则删除这两个元素，留下来的就是major
        int major = nums[0],count = 1;
        for(int i=1;i<nums.length;i++){
            if(nums[i] == major){
                count++;
            }else{
                if(count == 0){
                    major = nums[i];
                    count++;
                }else{
                    count--;
                }
            }
        }
        return major;
    }
}