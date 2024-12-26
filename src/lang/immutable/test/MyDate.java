package lang.immutable.test;

public class MyDate {
    private int year;
    private int month;
    private int day;

    public MyDate(int year,int Month,int day){
        this.year = year;
        this.month = Month;
        this.day = day;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getYear() {
        return year;
    }

    public int getMonth() {
        return month;
    }

    public int getDay() {
        return day;
    }

    @Override
    public String toString() {
        return year+"/"+month+"/"+day;
    }
}
