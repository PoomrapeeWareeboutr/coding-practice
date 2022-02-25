import java.util.Scanner;

public class Date {
    private int month; 
    private int day; 
    private int year;
    
    public Date (int myMonth,int myDay, int myYear) {   
        month = myMonth;
        day = myDay;
        year = myYear;
    }
    
    // Setter method
    public void setDayDate(int myDay) { day = myDay; }
    public void setMonthDate(int myMonth) { month = myMonth; }
    public void setYearDate(int myYear) { year = myYear; }
    
    // Getter method
    public int getDayDate() { return day; }
    public int getMonthDate() { return month; }
    public int getYearDate() { return year; }

    public void displayDate() {
        System.out.println("M/D/Y: "+ month + " " + day + " " + year);
    }

    public static void main(String[] args) { 
        
        Scanner input = new Scanner(System.in);
        Date myDate = new Date(9, 11, 1986);
        
        System.out.print("Enter The Month: ");
        int myMonth = input.nextInt();
        myDate.setMonthDate(myMonth);
        
        System.out.print("Enter the Date: ");
        int myDay = input.nextInt();
        myDate.setDayDate(myDay);
        
        System.out.print("Enter the Year: ");
        int myYear = input.nextInt();
        myDate.setYearDate(myYear);
        
        input.close();
        
        myDate.displayDate();
        
    }
}