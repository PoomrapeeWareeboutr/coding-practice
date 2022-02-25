
/**
 * TheConstructor
 */

public class TheConstructor {
    
    public static void main(String[] args) {
        // Pretending to passed 2 arguments to the constructor //
        // Integer: 20 and Double: 30d //
        TestConstructor testConstructor = new TestConstructor(20, 30d);
        testConstructor.testMethod();
    }
}

class TestConstructor {
    
    private Integer mA;
    private Double mB;
    private String mC;
    private Boolean mD;

    // The Construtor //
    public TestConstructor(Integer a, Double b, String c, Boolean d) {
        mA = a;
        mB = b;
        mC = c;
        mD = d;
    }
    
    // Overloaded of the Constructor //
    public TestConstructor() {
        this(0, 0.0, "0", false);
    }
    // Overloaded of the Constructor //
    public TestConstructor(Integer a, Double b) {
        this(a, b, "0", false);
    }
    // Overloaded of the Constructor //
    public TestConstructor(String c, Boolean d) {
        this(0, 0.0, c, d);
    }

    public void testMethod() {
        System.out.println(String.format("Integer : %15d", mA));
        System.out.println(String.format("Double  : %15f", mB));
        System.out.println(String.format("String  : %15s", mC));
        System.out.println(String.format("Boolean : %15b", mD));
    }
}