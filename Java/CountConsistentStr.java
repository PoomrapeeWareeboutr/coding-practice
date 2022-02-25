/*
LeetCode's Problem
# 1684 - Count the Number of Consistent Strings - Easy
*/

public class CountConsistentStr {
    static class Solution {
        public int countConsistentStrings(String allowed, String[] words) {
            
            char[] alphabet = allowed.toCharArray();
            
            int count = 0;
            for(int i = 0; i < words.length; i++) {
                int c = 1;
                for(int j = 0; j < words[i].length(); j++) { 
                    int f = 0;
                    for(int k = 0; k < alphabet.length; k++) {
                        if(words[i].charAt(j) == alphabet[k]) {
                            f = 1;
                            break;
                        }
                    }
                    if(f == 0) {
                        c = 0;
                        break;
                    }
                }
                if(c == 1) {
                    count++;
                }
            }
            return count;
        }
    }

    public static void main(String[] args) {
        String allowed;
        String[] words;
        int ans;
        
        allowed = "cad";
        words = new String[]{"cc","acd","b","ba","bac","bad","ac","d"};
        
        Solution ans_1 = new Solution();
        ans = ans_1.countConsistentStrings(allowed, words);
        System.out.println("# test case: " + ans);

        allowed = "abc";
        words = new String[]{"a","b","c","ab","ac","bc","abc"};

        Solution ans_2 = new Solution();
        ans = ans_2.countConsistentStrings(allowed, words);
        System.out.println("# test case: " + ans);

    }
}