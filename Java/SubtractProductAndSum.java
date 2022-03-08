class Solution {

    public int subtractProductAndSum(int n) {
        if(n == 0) return 0;
        int temp = n, sum = 0, product = 1;
        while(temp > 0) {
            int pop = temp % 10;
            sum += pop;
            product *= pop;
            temp /= 10;
        }
        
        return product - sum;
    }
}
