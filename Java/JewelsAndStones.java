/*
LeetCode's Problem
# 771 - Jewels and Stones - Easy
*/

public class JewelsAndStones {

    public static void main(String[] args) {
        String jewels = "aA";
        String stones = "aAAbbbb";
        
        NumJewelsInStones ans_1 = new NumJewelsInStones();
        System.out.println("# test_case: " + ans_1.numJewelsInStones(jewels, stones));

        jewels = "z";
        stones = "ZZ";
        NumJewelsInStones ans_2 = new NumJewelsInStones();
        System.out.println("# test_case: " + ans_2.numJewelsInStones(jewels, stones));

    }
}

class NumJewelsInStones {
    public int numJewelsInStones(String jewels, String stones) {
        
        int count = 0;
        char[] jewelTypes = jewels.toCharArray();

        for(int i = 0; i < stones.length(); i++) {
            for(int j = 0; j < jewelTypes.length; j++) {
                if(stones.charAt(i) == jewelTypes[j]) {
                    count++;
                    break;
                }
            }
        }

        return count;
    }
}