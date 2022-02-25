
public class OverloadedMethod {
    
    public static int sumOfTwoNumber(int x, int y) {
        return x + y;
    }

    public static double sumOfTwoNumber(double x, double y) {
        return x + y;
    }

    public static String sumOfTwoNumber(String x, String y) {
        
        int num_x = Integer.parseInt(x);
        int num_y = Integer.parseInt(y);

        return String.valueOf(num_x + num_y);
    }
    
    public static void main(String[] args) {
        int x = 5;
        int y = 10;

        double a = 5.5;
        double b = 10.5;

        String i = "20";
        String j = "70";

        System.out.println(sumOfTwoNumber(x, y));
        System.out.println(sumOfTwoNumber(a, b));
        System.out.println(sumOfTwoNumber(i, j));

    }
}
