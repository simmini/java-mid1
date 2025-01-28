package enumeration.ex3;

import java.util.Arrays;

public class EnumMethodMain {
    public static void main(String[] args) {
        //모든 enum반환
        Grade[]values=Grade.values();
        System.out.println("Arrays.toString(values) = " + Arrays.toString(values));
        for (Grade value:values) {
            System.out.println("vlaue= "+ value+" ,value.name() = " + value.name()+", ordinal="+value.ordinal());
        }

        //String->enum반환
        //잘못된 값이 에러: No enum constant

        Grade gold=Grade.valueOf("GOLD");
        System.out.println("gold = " + gold);

//        Grade error=Grade.valueOf("gold");
//        System.out.println(error);
    }
}
