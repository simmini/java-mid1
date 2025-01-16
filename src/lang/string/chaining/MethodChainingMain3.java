package lang.string.chaining;

public class MethodChainingMain3 {
    public static void main(String[] args) {
        ValueAdder adder=new ValueAdder();
        int result=adder.add(1).add(2).add(3).getValue();//반환된참조값을 사용,ㅈㅏ기자신의 참조값을 반환하기 때문에 .으로 이을수있음
        System.out.println("result = " + result);
    }
}

