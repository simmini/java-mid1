package lang.string.method;

public class StringSplitJoinMain {
    public static void main(String[] args) {
        String str="Apple,Banana,Orange";

        //split()
        String[]splitStr=str.split(",");;
        for (String s:splitStr){
            System.out.println(s);
        }

        //1. 문자열합치기- join()
        String joinStr="";
        for (int i=0;i<splitStr.length;i++){
            joinStr+=splitStr[i];
            if(i!=splitStr.length-1){
                joinStr+="-";
            }
        }

        System.out.println(joinStr);

        //2. 문자열합치기- 문자열 배열 연결
        String result=String.join("-",splitStr);
        System.out.println("result:"+result);
    }
}
