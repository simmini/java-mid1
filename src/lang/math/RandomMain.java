package lang.math;

import java.util.Random;

public class RandomMain {
    public static void main(String[] args) {
        Random rand = new Random(1);//seed가 같으면 random의 결과가 같다.

        int randomInt = rand.nextInt();
        System.out.println("randomInt = " + randomInt);

        double randomDouble = rand.nextDouble();//0.0d~1.0d
        System.out.println("randomDouble = " + randomDouble);

        boolean randomBoolean = rand.nextBoolean();
        System.out.println("randomBoolean = " + randomBoolean);

        //범위 조회
        int randomRange1 = rand.nextInt(10);//0~9까지 출력
        System.out.println("randomRange1 = " + randomRange1);

        int randomRange2 = rand.nextInt(10) + 1;//1~10까지 출력
        System.out.println("randomRange2 = " + randomRange2);
    }

}
