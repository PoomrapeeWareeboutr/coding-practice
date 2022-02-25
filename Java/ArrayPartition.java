/*
LeetCode's Problem
# 561 - Array Partition I - Easy
*/

import java.util.Arrays;

public class ArrayPartition {

    public static void main(String[] args) {
        ArrayPairSum ans_1 = new ArrayPairSum();
        int[] nums1 = new int[]{6,2,6,5,1,2};
        System.out.println("# test_case: " + ans_1.arrayPairSum(nums1) + "\n");

        ArrayPairSum ans_2 = new ArrayPairSum();
        int[] nums2 = new int[]{6,9,6,3,8,4};
        System.out.println("# test_case: " + ans_2.arrayPairSum(nums2) + "\n");

        ArrayPairSum ans_3 = new ArrayPairSum();
        int[] nums3 = new int[]{1,4,3,2};
        System.out.println("# test_case: " + ans_3.arrayPairSum(nums3));
    }
}

class ArrayPairSum {
    public int arrayPairSum(int[] nums) {
        
        Arrays.sort(nums);
        System.out.println("# sorted list: " + Arrays.toString(nums));

        int ans = 0;
        for(int i = 0; i < nums.length-1; i+=2) {
            ans += nums[i];
        }
        
        return ans;
    }
}