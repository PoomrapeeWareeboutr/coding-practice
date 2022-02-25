
import java.util.ArrayList;

public class Member {
    private String email;
    private String password;
    private ArrayList<Video> vdoList;
    
    Member(String email, String password) {
        this.email = email;
        this.password = password;
        vdoList = new ArrayList<>();
    }
    
    public boolean addVideo(Video vdo) {
        if(vdo != null) {
            vdoList.add(vdo);
            return true;
        }
        return false;
    }
    
    public boolean removeVideo(Video vdo) {
        for(int i = 0; i < vdoList.size(); i++) {
            if(vdoList.get(i).isEqual(vdo)) {
                System.out.print("Title: " + vdo.getTitle());
                System.out.println(" URL: " + vdo.getURL());
                vdoList.remove(i);
                System.out.println("is successfully removed.");
                return true;
            }
        }
        return false;
    }
    
    public void printMemberInfo() {
        System.out.printf("Email: %s (pwd: %s)\n", email, password);
        System.out.println("List of Videos");
        for(int i = 0; i < vdoList.size(); i++) {
            System.out.printf("[%d] Title: %s", i+1, vdoList.get(i).getTitle());
            System.out.println(" URL: " + vdoList.get(i).getURL());
        }
        System.out.println("-------------------");
    }
}
