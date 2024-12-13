package lang.poly;

public class ObjectPolyExample1 {
    public static void main(String[] args) {
        Dog dog=new Dog();
        Car car=new Car();

        action(dog);
        action(car);
    }
    public static void action(Object obj) {
        //obj.sound(); 컴파일 오류,object에는 sound가 없음
        //obj.move();

        //객체에 맞는 다운캐스팅 필요
        if(obj instanceof Dog dog){
            dog.sound();
        }else if(obj instanceof Car car){
            car.move();
        }
    }
}
