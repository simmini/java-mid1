package lang.object1.equals;

public class EqualsMainV2 {
    public static void main(String[] args) {
        UserV2 user1 = new UserV2("id-100");
        UserV2 user2 = new UserV2("id-100");

        System.out.println("identity="+(user1==user2));//동일성
        System.out.println("equal="+(user1.equals(user2)));//동등성
    }
}
