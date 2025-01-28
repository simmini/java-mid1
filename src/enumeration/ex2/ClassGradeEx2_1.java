package enumeration.ex2;

import enumeration.ex2.DiscountService;
import enumeration.ex1.StringGrade;

public class ClassGradeEx2_1 {

    public static void main(String[] args) {


    int price =10000;

    DiscountService discountService=new DiscountService();
    int basic =discountService.discount(ClassGrade.BASIC,price);
    int gold =discountService.discount(ClassGrade.GOLD,price);
    int diamond =discountService.discount(ClassGrade.DIAMOND,price);


    System.out.println("basic = " + basic);
    System.out.println("gold = " + gold);
    System.out.println("diamond = " + diamond);

}
}
