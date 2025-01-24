package lang.math.test;

import java.util.HashMap;
import java.util.Random;

public class LottoGenerator {

    private final Random random = new Random();//랜덤함
    private int []lottoNumbers;//저장할 객체
    private int count=0;

    public int[] getLotto() {
        lottoNumbers = new int[6];

        while(count<6){
            int number = random.nextInt(46)+1;
            if(isUnique(lottoNumbers[count])){
                lottoNumbers[count]=number;
                count++;
            }
        }
        return lottoNumbers;

    }
//이미 생성된 번호 와 중복되는지 검사
    private boolean isUnique(int number){
        for(int i=0; i<count; i++){
            if(lottoNumbers[i]==number){
                return false;
            }
        }

        return true;
    }

}
