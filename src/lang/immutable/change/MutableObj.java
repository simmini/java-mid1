package lang.immutable.change;

public class MutableObj {
    private int value;

    public MutableObj(int value) {
        this.value=value;
    }

    public void add(int addValue){
        value=value+addValue;//여기서 값이 변경됨
    }
    public int getValue(){
        return value;
    }
    public void setValue(int value){
        this.value=value;
    }
}
