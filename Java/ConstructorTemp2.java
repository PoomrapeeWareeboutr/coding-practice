// temp

public class ConstructorTemp2 {

    public static void main(String[] args) {
        
        C c = new C(1, 1);
        System.out.println("\nin C class before declare instance B");
        System.out.print(c.getA());
        System.out.print(" " + c.getB());
        System.out.print(" " + c.getC());
        System.out.print(" " + c.getD());
        System.out.print(" " + c.getE());
        System.out.print(" " + c.getF());
        
        B b = new B(0, 0, 0, 0);
        System.out.println("\nin C class after declare instance B");
        System.out.print(c.getA());
        System.out.print(" " + c.getB());
        System.out.print(" " + c.getC());
        System.out.print(" " + c.getD());
        System.out.print(" " + c.getE());
        System.out.print(" " + c.getF());

        System.out.println("\nin B class after declare instance B");
        System.out.print(c.getA());
        System.out.print(" " + b.getB());
        System.out.print(" " + b.getC());
        System.out.print(" " + b.getD());
        System.out.print(" " + b.getE());
        System.out.print(" " + b.getF());
        System.out.println();


    }
}

class A {
    private int a;
    private int b;
   
    A(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int getA() {
        return a;
    }
    public int getB() {
        return b;
    }
}

class B extends A {
    private static int mC; // 100
    private static int mD; // 101
    private static int mE; // 102
    private static int mF; // 103

    B(int c, int d, int e, int f) {
        super(200, 900);
        mC = c;
        mD = d;
        mE = e;
        mF = f;
    }

    public int getC() {
        return mC;
    }
    public int getD() {
        return mD;
    }
    public int getE() {
        return mE;
    }
    public int getF() {
        return mF;
    }

}

class C extends B{
    private int x;
    private int y;

    C(int x, int y) {
        super(90, 45, 30, 40);
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}