package lang.string.test;

public class TestString6 {
    public static void main(String[] args) {

        String str="start hello java, hello spring, hello jpa";
        String key="hello";

        int index=str.indexOf(key);
        int count=0;
        while(index>=0){
            index =str.indexOf(key,index+1);
            count++;
        }
        System.out.println("count = " + count);

    }
}
