/*
HackerRank's Problem
# Day 11: 2D Arrays - Easy
*/

public class SumOfHourglass {
    
    public static int sumOfHourglass(int[][] arr) {
        int max = Integer.MIN_VALUE;
        int sum = 0;
        for(int i = 0; i <= 3; i++) {
            for(int j = 1; j <= 4; j++) {
                int a = arr[i][j-1], b = arr[i][j], c = arr[i][j+1];
                int d = arr[i+1][j];
                int e = arr[i+2][j-1], f = arr[i+2][j], g = arr[i+2][j+1];
                
                sum = a + b + c + d + e + f + g;
                if(sum > max) {
                    max = sum;
                }
            }
        }   
        return max;
    }
    public static void main(String[] args) {
        
        int[][] arr1 = new int[][]{
            {1,1,1,0,0,0},
            {0,1,0,0,0,0},
            {1,1,1,0,0,0},
            {0,0,0,0,0,0},
            {0,0,0,0,0,0},
            {0,0,0,0,0,0}
        };
        System.out.println("# test case: " + sumOfHourglass(arr1));

        int[][] arr2 = new int[][]{
            {1,1,1,0,0,0},
            {0,1,0,0,0,0},
            {1,1,1,0,0,0},
            {0,0,2,4,4,0},
            {0,0,0,2,0,0},
            {0,0,1,2,4,0}
        };
        System.out.println("# test case: " + sumOfHourglass(arr2));

    }
}
