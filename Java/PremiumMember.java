
import java.util.ArrayList;

public class PremiumMember extends Member{
    private double fee;
    private ArrayList<String> family;
    private static double Family_FEE = 80;

    PremiumMember(String email, String password, double fee) {
        super(email, password);
        this.fee = fee;
        family = new ArrayList<>();
    }
    
    // Challenge Bonus
    public boolean addFamily(String username) {
        if(!username.isEmpty() && family.size() < 2) {
            family.add(username);
            System.out.println(username + " is added successfully.");
            return true;
        } else {
            System.out.println("user: " + username + " cannot be added, the Family user is reached the limit.");
        }
        return false;
    }
    
    // Challenge Bonus
    public boolean removeFamily(String username) {
        if(family.contains(username)) {
            family.remove(username);
            System.out.println(username + " is removed successfully.");
            return true;
        } else {
            System.out.println("user: " + username + " does not exist and cannot be removed.");
        }
        return false;
    }
    
    // Challenge Bonus
    public double getMonthlyBill() {
        return fee + Family_FEE;
    }

    @Override
    public void printMemberInfo() {
        System.out.println("---- PREMIUM MEMBER ----");
        System.out.println("Member fee: " + fee);
        super.printMemberInfo();
        
        // Bonus tab
        if(family.size() > 0) {
            System.out.println("List of Family");
            for(String name : family) {
                System.out.print(name + ",");
            }
            System.out.println();
        }
    }
}
