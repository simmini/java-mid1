package lang.string.method;

public class StringChangeMain2 {
    public static void main(String[] args) {
        String strWithSpaces="        java Programming ";

        System.out.println("소문자로 변환: "+strWithSpaces.toLowerCase());
        System.out.println("대문자로 변환: "+strWithSpaces.toUpperCase());

        System.out.println("공백 제거(trim): "+strWithSpaces.trim()+";");
        System.out.println("공백 제거(strip): "+strWithSpaces.strip()+";");//유니코드 공백까지 제거됨 ,자바11부터 지원

        System.out.println("앞공백 제거(strip): "+strWithSpaces.stripLeading()+";");
        System.out.println("뒤공백 제거(strip): "+strWithSpaces.stripTrailing()+";");
    }
}
