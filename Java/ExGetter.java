// Example of Accessor Method: Only Getter Method //

public class ExGetter {
    private final Integer X = 10;
    private static ExGetter var = new ExGetter();
    public static void main(String[] args) {
        // ExGetter var = new ExGetter();        
        System.out.println("In main method (class: ExGetter): " + var.X);
        Detailxxx.printInfo();
    }

    // This method called 'Getter' //
    public static Integer getX() {
        // ExGetter var = new ExGetter();
        return var.X;
    }
}

class Detailxxx {
    public static void printInfo() {
        // System.out.println(var.X);   ----> Error 
        // Can't access the member of the class of ExGetter because it private only in own class //
        // But we can use Accessor Method called Setter and Getter... //
        System.out.println("In printInfo method (class: Detailxxx): " + ExGetter.getX());
    }
}