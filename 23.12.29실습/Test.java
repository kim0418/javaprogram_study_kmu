public class Test {
    /*수정 전 코드
    public static void main(String[] args){
        int i=2, j=0;
        switch (i){
            case 0: j+=0;
            case 2: j+=2;
            case 4: j+=4;
            default: j+=6;
        }
        System.out.println(j);
    }
    break문이 없어서 탈출없이 case에 연속적으로 조건에 부합한다.*/
    public static void main(String[] args){
        //수정 후 코드
        int i=2, j=0;
        switch (i){
            case 0:
                j+=0;
                break;
            case 2:
                j+=2;
                break;
            case 4:
                j+=4;
                break;
            default:
                j+=6;
                break;
        }
        System.out.println(j);
    }
}
