import java.util.Scanner;

public class LoveAnimal {
    public static void main(String[] args) {
        
        String input_color;
        String default_animal = "cat";
        String sentence = "I love a ";

        System.out.println(sentence + default_animal);
        
        Scanner in = new Scanner(System.in);
        
        System.out.print("Change your animal: ");
        default_animal = in.next();
        System.out.println(sentence + default_animal);

        System.out.print("Change color: ");
        input_color = in.next();
        
        in.close();
        
        System.out.println(sentence + input_color + " " + default_animal);
    }
}
