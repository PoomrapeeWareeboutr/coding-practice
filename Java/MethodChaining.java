
// Example of Method Chaining in a class of Java //

public class MethodChaining {
    
    public static void main(String[] args) {
        PrintInfo show = new PrintInfo();

        int x = 10;
        String s = "Blue & Atom";
        boolean b = true;
        // This is a chain of method // 
        show.setX(x).setS(s).setB(b).print();
    }
}

class PrintInfo {
    private Integer mX;
    private String mS;
    private Boolean mB;

    public PrintInfo setX(Integer x) {
        mX = x;
        return this;
    }

    public PrintInfo setS(String s) {
        mS = s;
        return this;
    }
    
    public PrintInfo setB(Boolean b) {
        mB = b;
        return this;
    }
    
    public void print() {
        System.out.println("Value: " + mX);
        System.out.println("String: " + mS);
        System.out.println("Boolean: " + mB);
    }
}