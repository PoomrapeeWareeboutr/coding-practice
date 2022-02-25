// Basic sort by Java //
// Sort 2 name according to dictionary //

// Import class (Set of command or method) this part like a " #include <...> " in C programming //
import java.util.Scanner;

public class SortTwoName {
    
    // This like a function in C programming but the fuction that is in class called " Method " //
    public static void sortName(String str1, String str2) {
        if (str1.compareTo(str2) < 0) {
            System.out.println("Name 1: " + str1);
            System.out.println("Name 2: " + str2);
        } else {
            System.out.println("Name 1: " + str2);
            System.out.println("Name 2: " + str1);
        }
    }

    // This like a " int main(void) " in C programming //
    // When the program has been executed it gonna go to this place first //
    public static void main(String[] args) {
        String str1;
        String str2;

        Scanner in = new Scanner(System.in);
        str1 = in.nextLine();
        str2 = in.nextLine();
        in.close();
        sortName(str1, str2);
    }
}
