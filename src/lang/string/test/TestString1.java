package lang.string.test;

public class TestString1 {
    public static void main(String[] args) {
        String url="http://www.example.com";
        boolean result = url.startsWith("http://");
        System.out.println("result = " + result);
    }
}
