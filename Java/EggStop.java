public class EggStop {
   
    public static void top() {
        System.out.println("  ______");
        System.out.println(" /      \\");
        System.out.println("/        \\");
    }
    
    public static void bottom() {
        System.out.println("\\        /");
        System.out.println(" \\______/");
    }
    
    public static void generate() {
        
        for(int i = 0; i < 3; i++) {
            if (i == 0) {
                top();
                bottom();
            } else if (i == 1) {
                top();
                bottom();
                System.out.println("+--------+");
            } else {
                top();
                System.out.println("|  Stop  |");
                bottom();
                System.out.println("+--------+");
            }
        }
    }

    public static void main(String[] args) {
        generate();
    }
}
