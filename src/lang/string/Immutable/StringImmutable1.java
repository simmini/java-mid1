package lang.string.Immutable;

public class StringImmutable1 {
    public static void main(String[] args) {
        String str1="hello";
        String str2=str1.concat("java");//str1이 불변객체라서 새로운 객체를 만들어서 반환해준다.
        System.out.println("str1 = " + str1);
        System.out.println("str2 = " + str2);
    }
}
