
public class AnonymousClassTemp {
    // declaring to create an anonymous class by creating an instance of the class... 
    // the class that you want to lead it to override some method
    private static V2 person1 = new V2() {
        private String secretCode = "113";
        
        @Override
        public void name(String name) {
            System.out.println("V2 : " + name);
            System.out.println("Code: " + secretCode);
        }
    };

    public static void main(String[] args) {
        person1.name("Wall-E");
        // System.out.println(person1.secretCode);
    }
}

class Character {
    // Default constructor
    public Character() {
    }
    
    public void name(String name) {
        System.out.println(name);
    }
}

class V2 extends Character {
    
    // Default constructor
    public V2() {
        super();
    }
}