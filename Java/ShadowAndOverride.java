// A shadow and override example (and including a super keyword to refer a member of the superclass)
// and annotation @Override 

// ***** Note that *****
// A field variable or method that you want to override must be...
// modifier follow this: public, protected, default modifier and has no join with a 'final' modifier
// if you shadow or override the member that is a private member, it isn't called override...
// it is creating a new member in a subclass

public class ShadowAndOverride {

    public static void main(String[] args) {
        CarBlueprint obj = new CarBlueprint();
        BMW car_1 = new BMW();
        Honda car_2 = new Honda();
        
        obj.showPerf();
        System.out.println();
        car_1.showPerf();
        System.out.println();
        car_2.showPerf();
    }
}

class CarBlueprint {
    public int mMicrochip = 1;

    // Default constructor
    public CarBlueprint() {
    }

    // method member
    public void showPerf() {
        System.out.println("V1 - Microchip default speed: " + mMicrochip);
    }
}

class BMW extends CarBlueprint {
    private String mMicrochip = "2.0.0";
    protected String sentence = "textbook";

    // Default constructor
    public BMW() {
        super();
    }

    // the method that I want to override, 
    // I will place "@Override" above that method to tell java that...
    // I will override this method and want you to help me check the required condition to override
    @Override
    public void showPerf() {
        System.out.println(mMicrochip);
        System.out.println("V2 - Microchip speed x2 (+1): " + ((2*2)+1));
    }
    
    // No override
    public void sayHello() {
        System.out.println("Hello, world!");
    }
}

class Honda extends BMW {
    // This field variable has no shadow (override field variable) because...
    // in superclass, the variable "mMicrochip" is a private modifier,
    // So we can't override the private member of the superclass
    // therefore, this variable is a creating new variable in class Honda
    private Integer mMicrochip = 3;

    // Shadow this variable from String to int
    protected int sentence = 0;
    
    public Honda() {
        super();
    }
    
    @Override
    public void showPerf() {
        System.out.println(mMicrochip);
        System.out.println("V2 - Microchip speed x3 (+1): " + ((2*2)*2));
        System.out.println("Call the last version of a microchip from the superclass(BWM)...\n");
        super.showPerf();
        
        // if it has no override on the method you don't need to use a keyword super(),
        // just call the name of a field variable or method, you can access member
        sayHello();
        // After shadow the 'sentence' in this subclass 
        System.out.println("sentence in this class: " + this.sentence);
        // but we can refer to the old 'sentence' in the superclass by calling super() keyword
        // super.sentence
        System.out.println("sentence in superclass: " + super.sentence);
    }
}