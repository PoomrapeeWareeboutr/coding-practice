// Test Accessor Method //
// Use Setter & Getter to access a private field variable of a class //


public class SetterAndGetter {
    // Field variables //
    private Integer mX = 0;
    private Integer mY = 0;
    
    public static void main(String[] args) {
        // When creating a new instance it will return to value at the initialized value //
        // *** If it's not a static variable *** //
        ShowDetailTest printInfo = new ShowDetailTest();
        SetterAndGetter repr = new SetterAndGetter();

        int x = 10;
        int y = 20;

        System.out.println("Before");
        System.out.println("# print_by_main: x = " + repr.mX);
        System.out.println("# print_by_main: y = " + repr.mY);
        System.out.println();
        
        printInfo.testMethod(x, y);
        
        // Values of mX and mY not change because it's not a static variable //
        
        System.out.println("After");
        System.out.println("# print_by_main: x = " + repr.mX);
        System.out.println("# print_by_main: y = " + repr.mY);
        
    }
    // Accessor Method: Setter of mX //
    public void setX(Integer x) {
        mX = x;
    }
    // Accessor Method: Setter of mY //
    public void setY(Integer y) {
        mY = y;
    }
    // Accessor Method: Getter of mX //
    public Integer getX() {
        return mX;
    }
    // Accessor Method: Getter of mY //
    public Integer getY() {
        return mY;
    }
}

class ShowDetailTest {
    public void testMethod(Integer x, Integer y) {
        // When creating a new instance it will return to value at the initialized value //
        // *** If it's not a static variable *** //
        SetterAndGetter num = new SetterAndGetter();
        num.setX(x);
        num.setY(y);

        System.out.println("Change values by Accessor Method: 'Setter'");
        System.out.println("And output values by 'Getter' Method");
        
        System.out.println("# print_by_testMethod: x = " +  num.getX());
        System.out.println("# print_by_testMethod: y = " +  num.getY());
        System.out.println();
    }
}

