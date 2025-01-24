package lang.wrapper;

public class WrapperPrimitive {
    public static void main(String[] args) {
        int iterations=1_000_000_000;//반복횟수 설정,10억
        long startTime,endTime;

        //기본형 long사용
        long sumPrimitive=0;
        startTime = System.currentTimeMillis();
        for(int i=0;i<iterations;i++) {
            sumPrimitive+=i;
        }
        endTime = System.currentTimeMillis();
        System.out.println("sumPrimitive = " + sumPrimitive);
        System.out.println("기본자료형 long실행시간: "+(endTime-startTime)+"ms");

        //래퍼 클래스 long사용
        Long sumWrapper=0L;
        startTime = System.currentTimeMillis();
        for(int i=0;i<iterations;i++) {
            sumWrapper+=i;
        }
        endTime = System.currentTimeMillis();
        System.out.println("sumWrapper = " + sumWrapper);
        System.out.println("래퍼 클래스 long실행시간: "+(endTime-startTime)+"ms");
    }
}
