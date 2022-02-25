// temp

public class ConstructorTemp1 {

    public static void main(String[] args) {
        Car car = new Car("Blueprint of Cars", 0, 1);
        car.printInfo();
        System.out.println();

        Benz benz = new Benz("Beta V1");
        benz.printInfo();
        benz.printBeta();

        System.out.println();
        BenzV2 benz2 = new BenzV2();
        benz2.sayHello();
    }
}

class Car {
    private String mName;
    private int mPrice;
    private int mVersion; 

    // Default Constructor
    public Car() {
        mName = "Empty";
        mPrice = 0;
        mVersion = 0;
    }

    // Constructor
    public Car(String name, int price, int version) {
        mName = name;
        mPrice = price;
        mVersion = version;
    }
    
    public void printInfo() {
        System.out.println("Name: " + mName);
        System.out.println("Price: " + mPrice + " Millions");
        System.out.println("Version: " + mVersion);
    }
}

class Benz extends Car {
    private String mBeta;
    
    // In case that we have no pass any argument to the constructor
    // Default Constructor
    public Benz() {
        // Automatic call the constructor from the superclass by super() keyword
        super();
        mBeta = "Beta V.0"; 
    }

    // In case that we just pass one argument to the constructor of Benz class
    // Overloaded a constructor
    public Benz(String beta) {
        // Actually, the subclass will auto calls super() when an instance of subclass was declared
        // Like below
        // super();
        super(); 
        mBeta = beta;
    }
    
    // In case that we pass arguments follow the superclass // 
    // We can refer to the constructor of the superclass by call super('argument')
    public Benz(String name, int price, int version, String beta) {
        super(name, price, version);
        mBeta = beta;
    }

    public void printBeta() {
        System.err.println("Beta: " + mBeta);
    }

}

class BenzV2 extends Benz {
    private String mSentence = "Hello Driver";
    
    public BenzV2() {
        super();
        // mSentence = "Hi, Driver!";
    }

    public BenzV2(String sentence) {
        super();
        mSentence = sentence;
    }

    public void sayHello() {
        System.out.println(mSentence);
    }
}

