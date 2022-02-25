
public class CovidReporter {
    public static void main(String[] args) {
        CovidProfile a = new CovidProfile();
        // Changes a private field variables in the class CovidProfile by setter method
        a.setDate("2021-02-01");
        a.setLocation("AUSTRALIA");
        a.setAccumulatedCases(28_818);
        a.setCuredCases(26_061);
        a.setDeathCases(909);
        a.printCovidInfo();
        
        CovidProfile b = new CovidProfile(
                "2021-02-01", "FRANCE", 3_255_920,
                230_612, 76_201
            );
        b.printCovidInfo();

        CovidProfile c = new CovidProfile(
                "2021-02-01", "THAILAND", 19_618,
                12_514, 77
        );
        c.printCovidInfo();

        // For bonus challenge
        System.out.println("Number of CovidProfile: " + CovidProfile.count);
    }
}




