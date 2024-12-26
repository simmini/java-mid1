package lang.immutable.test;

public class ImmutableMyDate2 {
    private final int year;
    private final int month;
    private final int day;

    public ImmutableMyDate2(int year, int Month, int day){
        this.year = year;
        this.month = Month;
        this.day = day;
    }

    public ImmutableMyDate2 withYear(int newYear) {
        return new ImmutableMyDate2(newYear, month, day);
    }

    public ImmutableMyDate2 withMonth(int newMonth) {
        return new ImmutableMyDate2(year, newMonth, day);
    }

    public ImmutableMyDate2 withDay(int newDay) {
        return new ImmutableMyDate2(year, month, newDay);
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
