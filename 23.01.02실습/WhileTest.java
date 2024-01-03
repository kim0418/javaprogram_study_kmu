public class WhileTest {
    public static void main(String[] args){
        int sum=0, i=0;
        /*while(i<100){
            sum+=i;
            i+=2;
        }*/
        /*for(;i<100;i++){
            sum+=i;
            i+=1;
        }*/
        do{
            sum+=i;
            i+=2;
        }while(i<100);
        System.out.println(sum);
    }
}
