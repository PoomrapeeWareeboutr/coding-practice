
public class CovidProfile {
    public static int count = 0;
    private String date;
    private String location;
    private int accumulatedCases;
    private int curedCases;
    private int deathCases;
    
    // Default constructor
    public CovidProfile() {
        this("none", "none", 0, 0, 0);
    }

    // Constructor
    public CovidProfile(String date, String loc, int noACC, int noCured, int noDeath) {
        this.date = date;
        this.location = loc;
        this.accumulatedCases = noACC;
        this.curedCases = noCured;
        this.deathCases = noDeath;
        count++;
    }

    // Setter Method
    public void setDate(String date) { this.date = date; }
    public void setLocation(String location) { this.location = location; }
    public void setAccumulatedCases(int accumulatedCases) { this.accumulatedCases = accumulatedCases; }
    public void setCuredCases(int curedCases) { this.curedCases = curedCases; }
    public void setDeathCases(int deathCases) { this.deathCases = deathCases; }

    // Getter Method
    public String getDate() { return date; }
    public String getLocation() { return location; }
    public int getAccumulatedCases() { return accumulatedCases; }
    public int getCuredCases() { return curedCases; }
    public int getDeathCases() { return deathCases; }

    public boolean isSevere() {
        return getDeathCases() > 10_000;
    }

    // My owned method
    public void percentageData() {
        // Implicit casting
        double percentage = ((double)curedCases/(double)accumulatedCases)*100;
        double ratio = (percentage/100)*4;
        System.out.println("Percentage of cured cases per accumulated cases:");
        System.out.printf("\t- In percentage form: %.2f %%\n", percentage);
        System.out.printf("\t- In ratio form: %.2f/4\n", ratio);
    }

    public void printCovidInfo() {
        System.out.println(getLocation() + " at " + getDate());
        System.out.println("Accumulative Patient: " + getAccumulatedCases());
        System.out.println("Cured Patient: " + getCuredCases());
        System.out.println("Death cases: " + getDeathCases());
        System.out.println("Status of severe: " + isSevere());
        percentageData();
        System.out.println();
    }
}
