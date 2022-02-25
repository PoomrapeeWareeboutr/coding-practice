
public class MyDate {
    // Field variables
    private int year;
    private int month;
    private int day;
    private int objectNumber = 0;
    public static int objectCounter = 0;
    public static String[] strMonths = {
            "Jan", "Feb", "Mar", "Apr", "May", "Jun",
            "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"
    };
    
    // Default constructor
    public MyDate() { this(1900, 1, 1); }

    // Constructor
    public MyDate(int year, int aMonth, int aDay) {
        this.year = year;
        this.month = aMonth;
        this.day = aDay;

        // Counting instance that created
        objectCounter++;
        objectNumber = objectCounter;
    }

    public void setDate(int year, int aMonth, int aDay) {
        this.year = year;
        this.month = aMonth;
        this.day = aDay;
    }

    // Setter method
    public void setYear(int year) { this.year = year; }
    public void setMonth(int month) { this.month = month; }
    public void setDay(int day) { this.day = day; }
    
    // Getter method
    public int getYear() { return this.year; }
    public int getMonth() { return this.month; }
    public int getDay() { return this.day; }
    public int getObjectNumber() { return this.objectNumber; }

    public MyDate nextDay() {
    	if(month == 12 && day == 31) {
            year = year + 1;
            month = 1;
            day = 1;
        } else {
            if(month == 4 || month == 6 || month == 9 || month == 11) {
                if(day == 30) {
                    month = month + 1;
                    day = 1;
                } else {
                    day = day + 1;
                }
            } else if(month != 2) {
                if(day == 31) {
                    month = month + 1;
                    day = 1;
                } else {
                    day = day + 1;
                }
            } else {
                if(isLeapYear(year) && day == 29) {
                    month = month + 1;
                    day = 1;
                } else if(!isLeapYear(year) && day == 28) {
                    month = month + 1;
                    day = 1;
                } else {
                    day = day + 1;
                }
            }
        }
        return this;
    }

    public MyDate nextMonth() {
        if(month == 12) {
            year = year + 1;
            month = 1;
        } else {
            if(month == 3 || month == 5 || month == 8 || month == 10) {
                if(day == 31) {
                    month = month + 1;
                    day = 30;
                } else {
                    month = month + 1;
                }
            } else if(month != 1) {
                month = month + 1;
            } else {
                if(isLeapYear(year)) {
                    if(day >= 29 && day <= 31) {
                    	month = month + 1;
                        day = 29;
                    } else {
                        month = month + 1;
                    }
                } else {
                    if(day >= 28 && day <= 31) {
                        month = month + 1;
                        day = 28;
                    } else {
                        month = month + 1;
                    }
                }
            }
        }
        return this;
    }
    
    public MyDate nextYear() {
        if(isLeapYear(year) && month == 2) {
            if(day == 29) {
                day = 28;
                year = year + 1;
            } else {
                year = year + 1;
            }
        } else {
            year = year + 1;
        }
        return this;
    }

    public MyDate previousDay() {
        if(month == 1 && day == 1) {
            year = year - 1;
            month = 12;
            day = 31;
        } else {
            if(month == 5 || month == 7 || month == 10 || month == 12) {
                if(day == 1) {
                    month = month - 1;
                    day = 30;
                } else {
                    day = day - 1;
                }
            } else if(month != 3) {
                if(day == 1) {
                    month = month - 1;
                    day = 31;
                } else {
                    day = day - 1;
                }
            } else {
                if(isLeapYear(year) && day == 1) {
                    month = month - 1;
                    day = 29;
                } else if(day == 1) {
                    month = month - 1;
                    day = 28;
                } else {
                    day = day - 1;
                }
            }
        }
        return this;
    }
    
    public MyDate previousMonth() {
        if(month == 1) {
            year = year - 1;
            month = 12;
        } else {
            if(month == 5 || month == 7 || month == 10 || month == 12) {
                if(day == 31) {
                    month = month - 1;
                    day = 30;
                } else {
                    month = month - 1;
                }
            } else if(month != 3) {
                month = month - 1;
            } else {
                if(isLeapYear(year)) {
                    if(day >= 29 && day <= 31) {
                        month = month - 1;
                        day = 29;
                    } else {
                        month = month - 1;
                    }
                } else {
                    if(day >= 28 && day <= 31) {
                        month = month - 1;
                        day = 28;
                    } else {
                        month = month - 1;
                    }
                }
            }
        }
        return this;
    }

    public MyDate previousYear() {
        if(isLeapYear(year) && month == 2) {
            if(day == 29) {
                day = 28;
                year = year - 1;
            } else {
                year = year - 1;
            }
        } else {
            year = year - 1;
        }
        return this;
    }

    public static boolean isLeapYear(int year) {
        if(year % 4 != 0) {
            return false;
        } else if(year % 100 != 0) {
            return true;
        } else if(year % 400 != 0) {
            return false;
        } else {
            return true;
        }
    }

    public static int dateDiff(MyDate a, MyDate b) {
        int dayCounter = 0;
        MyDate temp = new MyDate(a.getYear(), a.getMonth(), a.getDay());
        while(!temp.toString().equals(b.toString())) {
            temp.nextDay();
            dayCounter++;
        }
        return dayCounter;
    }
    
    @Override
    public String toString() {
        return String.format("%02d %s %d", day, strMonths[month-1], year);
    }
}
