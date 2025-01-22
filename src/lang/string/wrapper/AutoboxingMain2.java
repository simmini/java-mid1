package lang.string.wrapper;

public class AutoboxingMain2 {
    public static void main(String[] args) {
        //primitive->Wrapper
        int value=7;
        Integer boxedValue=value;

        //Wrapper -> primitive
        int unboxedValue=boxedValue;

        System.out.println("unboxedValue = " + unboxedValue);
        System.out.println("boxedValue = " + boxedValue);
    }

}
