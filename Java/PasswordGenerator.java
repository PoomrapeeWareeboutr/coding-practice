import java.util.Random;

public class PasswordGenerator {
    public static void main(String[] args) {
        
        String password = "";
        Random random = new Random();

        for(int i = 1; i <= 10; i++) {
            int type = random.nextInt(3);
            if(type == 0) {                             // Type 0 is for generate the number 0 - 9 //
                int type_0 = random.nextInt(10);
                password += type_0;
            } else if (type == 1) {                     // Type 1 is for generate the letter A - Z //
                int type_1 = random.nextInt(26);
                type_1 += 65;
                password += (char)type_1;
            } else {                                    // Type 2 is for generate the letter a - z //
                int type_2 = random.nextInt(26);
                type_2 += 97;
                password += (char)type_2;
            }
        }
        System.out.println("# test_case: " + password);

    }
}