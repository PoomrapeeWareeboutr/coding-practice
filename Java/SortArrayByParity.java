/*
LeetCode's Problem
# 905 - Sort Array By Parity - Easy
*/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class SortArrayByParity {
    
    public static void main(String[] args) {
        SortAnsParity ans_1 = new SortAnsParity();
        int[] arr1 = new int[] {3,1,2,4};
        System.out.println("# test_case: " + Arrays.toString(ans_1.sortArrayByParity(arr1)));
    }
}

class SortAnsParity {
    public int[] sortArrayByParity(int[] A) {
        
        ArrayList<Integer> evenA = new ArrayList<>();
        ArrayList<Integer> oddA = new ArrayList<>();
        
        int i = 0;
        while(i < A.length) {
            if(A[i]%2 == 0) {
                evenA.add(A[i]);
            } else {
                oddA.add(A[i]);
            }
            i++;
        }
        Collections.sort(evenA);
        Collections.sort(oddA);
        evenA.addAll(oddA);
        
        i = 0;
        while(i < A.length) {
            A[i] = evenA.get(i);
            i++;
        }

        return A;
    }
}