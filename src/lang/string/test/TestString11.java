package lang.string.test;

public class TestString11 {
    public static void main(String[] args) {

        String str="Hello Java";
        StringBuilder br=new StringBuilder(str);
        StringBuilder reverse = br.reverse();
        System.out.println("reverse = " + reverse);

    }
}
