
public class FreeMember extends Member{
    private final int FREE_LIMITED_VDOs = 3;
    private int numDownloadedVDO = 0;
    
    FreeMember(String email, String password) {
        super(email, password);
    }
    
    public int getNumVideo() {
        return numDownloadedVDO;
    }
    
    @Override
    public boolean addVideo(Video vdo) {
        if(numDownloadedVDO < FREE_LIMITED_VDOs) {
            if(super.addVideo(vdo)) {
                numDownloadedVDO++;
                return true;
            }
        } else {
            System.out.print("Title: " + vdo.getTitle());
            System.out.println(" URL: " + vdo.getURL());
            System.out.println("cannot be downloaded because the number of the video is reaching the limit.");
        }
        return false;
    }
    
    @Override
    public boolean removeVideo(Video vdo) {
        if(super.removeVideo(vdo)) {
            numDownloadedVDO--;
            return true;
        }
        return false;
    }
    
    @Override
    public void printMemberInfo() {
        System.out.println("---- FREE MEMBER ----");
        super.printMemberInfo();
    }
}
