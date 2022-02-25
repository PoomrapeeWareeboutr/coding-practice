import java.util.*;

public class AdjacentOneInBinary {
    public static void main(String[] args) {
        
        int n;
        
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        in.close();

        int max = 0;
        int count = 0;
        while(n != 0) {
            int pop = n % 2;
            n /= 2;
            if(pop == 1) {
                count++;
                if(count > max) {
                    max = count;
                }
            } else {
                count = 0;
            }
        }
        System.out.println("# test_case: " + max);
    }
}
