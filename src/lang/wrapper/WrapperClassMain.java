package lang.wrapper;

public class WrapperClassMain {
    public static void main(String[] args) {
        Integer newInteger=new Integer(10);//삭제예정
        Integer integerObj = Integer.valueOf(10);//-128~127 자주사용하는 값 재사용,불변

        Long longObj = Long.valueOf(100);
        Double doubleObj = Double.valueOf(10.5);

        System.out.println("integerObj = " + integerObj);
        System.out.println("newInteger = " + newInteger);
        System.out.println("longObj = " + longObj);
        System.out.println("doubleObj = " + doubleObj);


        System.out.println("내부값 읽기");
        int intValue=integerObj.intValue();
        System.out.println("intValue = " + intValue);

        Long longValue=longObj.longValue();
        System.out.println("longValue = " + longValue);

        Double doubleValue=doubleObj.doubleValue();
        System.out.println("doubleValue = " + doubleValue);

        System.out.println("비교");
        System.out.println("==:"+(newInteger==integerObj));
        System.out.println("equals: "+(newInteger.equals(integerObj)));

    }
}
