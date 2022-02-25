
// temp

public class AbstractClassTemp1 {

    public static void main(String[] args) {
        // Upcasting
        Shape obj = new ShowAreaRectangle(7, 10);
        System.out.println("Area = " + obj.calculateArea());
    }
}

abstract class Shape {
    protected double area;
    
    // Default constructor
    Shape() {
    }

    protected abstract double calculateArea();
}

abstract class Rectangle extends Shape {
    
    // Constructor
    Rectangle(int w, int h) {
        // Constructor chaining
        super();
        this.area = w*h;
    }

    // Override an abstract method. So, we don't need to use the 'abstract' keyword in front of a modifier 
    @Override
    public double calculateArea() {
        return this.area;
    }
}

class ShowAreaRectangle extends Rectangle {
    
    ShowAreaRectangle(int w, int h) {
        super(w, h);
    }

    public void showArea() {
        System.out.println(super.area);
    }
}