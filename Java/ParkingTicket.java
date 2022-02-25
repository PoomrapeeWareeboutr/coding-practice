import java.util.Scanner;

public class ParkingTicket {
    
    private static int hour = 0;
    private static int minute = 0;
    private static int c = 0;

    public static int hoursToMinutes(String[] temp) {
        int minute = 0;
        String mTemp;
        mTemp = temp[0] + temp[1];
        minute += Integer.parseInt(mTemp)*60;

        mTemp = temp[2] + temp[3];
        minute += Integer.parseInt(mTemp);
        
        return minute;
    }

    public static void printParkingDuration(String enterTime, String leaveTime) {
        System.out.println("Entering time -> " + enterTime);
        System.out.println("Leaving time -> " + leaveTime);

        String[] x = enterTime.split("");
        String[] y = leaveTime.split("\s");
        
        if(y.length == 1) {
            y = leaveTime.split("");
        } else if(y.length > 1 && y[1].equalsIgnoreCase("(overnight)")) {
            y = y[0].split("");
            c = 1;
        } else {
            y = leaveTime.split("");
        }   
        
        int enterMinute = hoursToMinutes(x);
        int leaveMinute = hoursToMinutes(y);

        if(c == 0) {
            minute = Math.abs(leaveMinute - enterMinute);
            
            while(minute > 60) {
                minute -= 60;
                hour += 1;
            }

            System.out.printf("Parking duration: %d hours %d minutes\n", hour, minute);
        } else {
            int minuteDay = 24*60;
            minute = Math.abs((minuteDay - enterMinute) + leaveMinute);
            
            while(minute > 60) {
                minute -= 60;
                hour += 1;
            }
            
            System.out.printf("Total duration: %d hours %d minutes\n", hour, minute);
        }
    }
    
    public static void printParkingFee(int hour, int minute) {
        double fee = 0;
        if(hour > 2) {
            fee += (hour - 2) * 99;
        } 
        
        if(minute <= 30) {
            fee += 49.50;
        } else {
            fee += 99;
        }

        if(c == 0) {
            System.out.println("Parking fee: " + fee);
        } else {
            System.out.println("Total parking fee " + fee);
        }
    }

    public static void showParking() {
        for(int i = 1; i <= hour; i++) {
            System.out.print("|");
            for(int j = 1; j <= 60; j++) {
                System.out.print("*");
                if(j % 15 == 0 && j != 60) {
                    System.out.print("|");
                }
            }
            System.out.println(" " + i + " hr");
        }

        int tempM = minute;
        System.out.print("|");
        for(int i = 1; i <= 60; i++) {
            if(tempM > 0) {
                System.out.print("*");
            } else {
                System.out.print(" ");
            }
            
            if(i % 15 == 0 && i != 60) {
                System.out.print("|");
            }
            tempM--;
        }

        System.out.println(" " + minute + " min");
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String enterTime = in.nextLine();
        String leaveTime = in.nextLine();
        in.close();
        
        printParkingDuration(enterTime, leaveTime);
        showParking();
        printParkingFee(hour, minute);
        
    }
}
