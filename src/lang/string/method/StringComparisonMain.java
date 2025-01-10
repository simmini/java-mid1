package lang.string.method;

public class StringComparisonMain {
    public static void main(String[] args) {
        String str1="Hello, Java!";//대문자 일부 있음
        String str2="hello, java!";//대문자 없음 모두 소문자
        String str3="Hello, World!";

        System.out.println("str1 equals str2: "+str1.equals(str2));
        System.out.println("str2 equalsIgnoreCase str3: "+str1.equalsIgnoreCase(str2));

        System.out.println("b compare To a:"+"b".compareTo("a"));
        System.out.println("a compare To b:"+"a".compareTo("b"));
        System.out.println("c compare To a:"+"c".compareTo("a"));

        System.out.println("str1 compareto str3:"+ str1.compareTo(str3));
        System.out.println("str1 compareto str2:"+ str1.compareToIgnoreCase(str2));


        System.out.println("str1 starts with 'hello':"+str1.startsWith("Hello"));
        System.out.println("str1 ends with 'hello':"+str1.endsWith("Java!"));

    }
}
