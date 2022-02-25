// Example of Static Modifier //

public class StaticModifier {
    // Define non-static field variables //
    public Double mW = 10d;
    public Double mB = 10d;
    public Double mR = 10d;
    public Double mH = 5d;

    // Define static field variables //
    public static Integer mValues = 0;

    public static void main(String[] args) {    // -----> Static method //
        // The main method is a static method, so it can call only static method //
        // If you want to call non-static method in this main, you can do it... //
        // But, you must create an instance of a class that has a method you want //
        // Like this... //

        // Create an instance of the class of StaticModifier for retrieve field variables //
        StaticModifier var = new StaticModifier();

        // Create an instance of the class of AllNonStaticMethods for use methods of this class //
        AllNonStaticMethods nonStaticMethod = new AllNonStaticMethods();

        // Now you can use non-static methods in the static method... ///
        System.out.println();
        System.out.println("Non-static methods:");
        System.out.println("Rectangle area: " + nonStaticMethod.rectangleArea(var.mW, var.mH));
        System.out.println("Triangle area: " + nonStaticMethod.triangleArea(var.mB, var.mH));
        System.out.println("Circle area: " + nonStaticMethod.circleArea(var.mR));

        // But if you don't want to create an instance of the class, and you want to use something from it... //
        // You must define 'static' front of the return type of method or behind Access Modifier like below... //
        // Ex. ----> public static void printOutput() {...} //
        // And when you give some methods are a static method, it doesn't need to create an instance for use those methods from a class... //
        // Like below... ///
        
        // Static method //
        System.out.println();
        System.out.println("Static methods:");
        System.out.println("Rectangle area: " + AllStaticMethods.rectangleArea(var.mW, var.mH));
        System.out.println("Triangle area: " + AllStaticMethods.triangleArea(var.mB, var.mH));
        System.err.println("Circle area: " + AllStaticMethods.circleArea(var.mR));

        // ***** //
        // And if you define static to field variable, that variable will be the same reference of all instance that you call //
        // Or if some method changes the value of that variable, the value of the variable will be changed forever... // 
        // Like below... //
        System.out.println();
        System.out.println("Before\n(in main method from class of 'StaticModifier'): " + mValues);
        nonStaticMethod.changeValue(mValues);
        // Field variable 'mValues' will change self-values forever cause it a same reference when you call it //
        // But non-static will not change a value because it need to create an instance... //
        // And when you create a new instance it will retrieve the new default value from the initial point to the new instance // 
        System.out.println("After\n(in main method from class of 'StaticModifier'): " + mValues);
    }
}

// All Non-static methods here //
// Geometry formulas //
class AllNonStaticMethods {
    public Double rectangleArea(Double w, Double h) {
        return w * h;
    }

    public Double triangleArea(Double b, Double h) {
        return 0.5 * b * h;
    }

    public Double circleArea(Double r) {
        return 3.14 * (r*r);
    }
    
    // Note that: Non-static method can call the static method freely without creating an instance of the class //
    public void changeValue(Integer mValues) {
        StaticModifier.mValues = 95;
        System.out.println("(in changeValue method from class of 'AllNonStaticMethods'): " + StaticModifier.mValues);
    }
}

// All Static methods here //
// Geometry formulas //
class AllStaticMethods {
    public static Double rectangleArea(Double w, Double h) {
        return w * h;
    }

    public static Double triangleArea(Double b, Double h) {
        return 0.5 * b * h;
    }

    public static Double circleArea(Double r) {
        return 3.14 * (r*r);
    } 
}
