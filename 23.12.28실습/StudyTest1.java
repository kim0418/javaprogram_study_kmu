public class StudyTest1{
    public static void main(String[] args){
        byte a=64;
        byte b=64;
        /* 코드오류
        byte result=a+b;
        byte의 크기가 부족하여 에러가 발생한다.*/
        int result=a+b;
        System.out.println(("result = "+result));
    }
}
