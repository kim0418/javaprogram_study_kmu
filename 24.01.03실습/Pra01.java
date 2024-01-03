public class Pra01 {
    public static void main(String[] args){
        int[] dicAry = new int[100];
        int hap;
        double avg;

        for(int i=0;i< dicAry.length;i++){
            dicAry[i]=(int)(Math.random()*6+1);
        }
        hap=0;
        for(double s : dicAry){
            hap+=s;
        }
        avg=(double)hap/ dicAry.length;
        System.out.println("100번 던진 주사위 값의 평균은 "+avg+"입니다.");
    }
}
