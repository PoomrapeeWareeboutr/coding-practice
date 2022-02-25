/*
Leetcode's Problem
# 67 - Add Binary - Easy
*/

public class AddTwoBinary {
    static class Solution {
        public String addBinary(String a, String b) {
            
            int x = Integer.parseInt(a, 2);
            int y = Integer.parseInt(b, 2);
            int z = x + y;
            
            if(z == 0) {
                return "0";
            }
            
            String temp = "";
            while(z != 0) {
                int pop = z % 2;
                z /= 2;
                temp += pop;
            }
            
            String ans = "";
            int rev_index = temp.length()-1;
            while(rev_index >= 0) {
                ans += temp.charAt(rev_index);
                rev_index--;
            }
            
            return ans;
        }
    }

    public static void main(String[] args) {
    String a = "1010";
    String b = "1011";
    Solution ans_1 = new Solution();
    System.out.println("# test_case: " + ans_1.addBinary(a, b));
        
    a = "11";
    b = "1";
    Solution ans_2 = new Solution();
        System.out.println("# test_case: " + ans_2.addBinary(a, b));
    }
}
