package enumeration.ex2;

import enumeration.ex0.DiscountService;
import enumeration.ex1.StringGrade;

public class ClassRefMain {

    public static void main(String[] args) {


    int price =10000;

    /*
    DiscountService discountService=new DiscountService();
    int basic =discountService.discount(StringGrade.BASIC,price);
    int gold =discountService.discount(StringGrade.GOLD,price);
    int diamond =discountService.discount(StringGrade.DIAMOND,price);
    */
        System.out.println("basic.class = " + ClassGrade.BASIC.getClass());
        System.out.println("gold.class = " + ClassGrade.GOLD.getClass());
        System.out.println("diamond.class = " + ClassGrade.DIAMOND.getClass());


    System.out.println("basic = " + ClassGrade.BASIC);
    System.out.println("gold = " + ClassGrade.GOLD);
    System.out.println("diamond = " + ClassGrade.DIAMOND);

}
}
