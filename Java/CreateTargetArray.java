/*
LeetCode's Problem;
# 1389 - Create Target Array in the Given Order - Easy
*/

import java.util.ArrayList;
import java.util.Arrays;

public class CreateTargetArray {

    public static void main(String[] args) {
        CreateTargetArrayAnswer ans_1 = new CreateTargetArrayAnswer();
        
        int[] nums1 = {0,1,2,3,4};
        int[] index1 = {0,1,2,2,1};
        System.out.println("# test case:");
        System.out.println("# " + Arrays.toString(ans_1.createTargetArray(nums1, index1)));

        CreateTargetArrayAnswer ans_2 = new CreateTargetArrayAnswer();
        int[] nums2 = {1,2,3,4,0};
        int[] index2 = {0,1,2,3,0};
        System.out.println("# test case:");
        System.out.println("# " + Arrays.toString(ans_2.createTargetArray(nums2, index2)));
    }
}

class CreateTargetArrayAnswer {
    public int[] createTargetArray(int[] nums, int[] index) {
        ArrayList<Integer> arr = new ArrayList<>();
        
        int i = 0;
        while(i < index.length) {
            arr.add(index[i], nums[i]);
            i++;
        }

        int[] ans = new int[arr.size()];
        i = 0;
        for (Integer integer : arr) {
            ans[i] = integer;
            i++;
        }
        
        return ans;
    }
}
