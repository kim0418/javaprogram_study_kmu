import java.util.Scanner;

public class MutipleOfThree {
    public static void main(String[] args){
        int arr[] = new int[10];
        Scanner scanner = new Scanner(System.in);
        System.out.print("양의 정수를 입력하시오 >>> ");
        for(int i=0;i<10;i++){
            arr[i]=scanner.nextInt();
        }
        System.out.print("3의 배수는 ");
        for(int s:arr){
            if(s%3==0){
                System.out.print(s+" ");
            }
        }
    }
}
