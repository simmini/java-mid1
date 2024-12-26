package lang.immutable.address;

public class MemberMainV2 {
    public static void main(String[] args) {
        ImmutableAddress address=new ImmutableAddress("서울");

        MemberV2 memberA=new MemberV2("회원A",address);
        MemberV2 memberB=new MemberV2("회원B",address);

        //모두서울
        System.out.println("memberA = " + memberA);
        System.out.println("memberB = " + memberB);

        //memberB는 address타입으로 set,get을 할수 있으므로
        //1. b만 부산으로 변경
        ImmutableAddress address1=new ImmutableAddress("부산");
        memberB.setAddress(address1);


        //2. b만 부산으로 변경-  축약
        //memberB.getAddress().setValue("부산");//컴파일 오류
        //memberV2가 불변이 아닌 ImmutableAddress가 불변임
        memberB.setAddress(new ImmutableAddress("부산"));

        System.out.println("memberA = " + memberA);
        System.out.println("memberB = " + memberB);



    }
}
