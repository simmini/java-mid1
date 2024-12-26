package lang.immutable.test;

public class ImmutableMyDateMain2 {
    public static void main(String[] args) {

        ImmutableMyDate2 date1=new ImmutableMyDate2(2024,1,1);
        ImmutableMyDate2 date2=date1;

        System.out.println("date1 = " + date1);
        System.out.println("date2 = " + date2);

        System.out.println("2025 -> data1");
        date1=date1.withYear(2025);
        System.out.println("date1 = " + date1);
        System.out.println("date2 = " + date2);
    }
}
