package lang.tostring;

public class ToStringMain2 {

    public static void main(String[] args) {
        Car car=new Car("Model Y");
        Dog dog1=new Dog("멍멍이1",2);
        Dog dog2=new Dog("멍멍이2",5);

        System.out.println("1. 단순 tostring호출");
        System.out.println(car.toString());
        System.out.println(dog1.toString());
        System.out.println(dog2.toString());


        System.out.println("2. println내에서 tostring호출");
        System.out.println(car);
        System.out.println(dog1);
        System.out.println(dog2);

        System.out.println("3. object 다형성 활용");
        ObjectPrinter.print(car);
        ObjectPrinter.print(dog1);
        ObjectPrinter.print(dog2);

        //toString오버라이딩 하면 참조값이 안보임
        //보이게 하는법
        String hexString = Integer.toHexString(System.identityHashCode(dog1));
        System.out.println(hexString);

    }




}









