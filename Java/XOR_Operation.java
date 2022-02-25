/*
LeetCode's Problem
# 1486 - XOR Operation in an Array - Easy
*/

import java.util.ArrayList;

public class XOR_Operation {

    public static void main(String[] args) {
        int n = 5;
        int start = 0;

        XOROperation ans_1 = new XOROperation();
        System.out.println("# test_case: " + ans_1.xorOperation(n, start));
        
        n = 4;
        start = 3; 
        XOROperation ans_2 = new XOROperation();
        System.out.println("# test_case: " + ans_2.xorOperation(n, start));

        n = 10;
        start = 5; 
        XOROperation ans_3 = new XOROperation();
        System.out.println("# test_case: " + ans_3.xorOperation(n, start));

    }
}

class XOROperation {
    public int xorOperation(int n, int start) {
        
        ArrayList<String> arr = new ArrayList<>();

        int i = 0;
        int max_length = 0;
        while(i < n) {
            int num = start + 2*i;
            String binary = Integer.toBinaryString(num);
            arr.add(binary);
            if(binary.length() > max_length) {
                max_length = binary.length();
            }
            i++;
        }

        i = 0;
        while(i < n) {
            if(arr.get(i).length() < max_length) {
                int lengthTemp = arr.get(i).length();
                StringBuilder strTemp = new StringBuilder(arr.get(i));
                while(lengthTemp < max_length) {
                    strTemp.insert(0, "0");
                    lengthTemp++;
                }
                arr.set(i, String.valueOf(strTemp));
            }
            i++;
        }
        System.out.print("# Binary list: ");
        for (String string : arr) {
            System.out.print(string + " ");
        }
        System.out.println();

        i = 1;
        while(i < n) {
            int j = 0;
            StringBuilder strTemp = new StringBuilder();
            while(j < max_length) {
                if(arr.get(i).charAt(j) != arr.get(i-1).charAt(j)) {
                    strTemp.append("1");
                } else {
                    strTemp.append("0");
                }
                j++;
            }
            arr.set(i, String.valueOf(strTemp));
            arr.set(i-1, "0");
            i++;
        }
        
        int ans = Integer.parseInt(arr.get(n-1), 2);
        return ans;

    }
}