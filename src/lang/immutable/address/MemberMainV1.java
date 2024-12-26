package lang.immutable.address;

public class MemberMainV1 {
    public static void main(String[] args) {
        Address address=new Address("서울");

        MemberV1 memberA=new MemberV1("회원A",address);
        MemberV1 memberB=new MemberV1("회원B",address);

        //모두서울
        System.out.println("memberA = " + memberA);
        System.out.println("memberB = " + memberB);

        //memberB는 address타입으로 set,get을 할수 있으므로
        //1. b만 부산으로 변경
        Address address1=memberB.getAddress();
        address1.setValue("부산");

        //2. b만 부산으로 변경-  축약
        memberB.getAddress().setValue("부산");

        System.out.println("memberA = " + memberA);
        System.out.println("memberB = " + memberB);



    }
}
