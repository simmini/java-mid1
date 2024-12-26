package lang.immutable.change;

public class ImmutableObj {
    private final int value;

    public ImmutableObj(int value) {
        this.value=value;
    }

    public ImmutableObj add(int addValue){
        int result=value+addValue;//자기 자신 반환안하고 새로운 객체를 만들어서 반환
        return new ImmutableObj(result);
    }
    public int getValue(){
        return value;
    }

}

