package lang.string.wrapper;

public class AutoboxingMain1 {
    public static void main(String[] args) {
        //primitive->Wrapper
        int value=7;
        Integer boxedValue=Integer.valueOf(value);

        //Wrapper -> primitive
        int unboxedValue=boxedValue.intValue();

        System.out.println("unboxedValue = " + unboxedValue);
        System.out.println("boxedValue = " + boxedValue);
    }

}
