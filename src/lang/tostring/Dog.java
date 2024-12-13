package lang.tostring;

public class Dog extends Object{
    private String dogName;
    private int age;

    public Dog( String dogName,int age) {
        this.age = age;
        this.dogName = dogName;
    }

    @Override
    public String toString() {
        return dogName+":"+age;
    }
}
