import java.util.Scanner;

public class PrintAsterisk {
    public static void main(String[] args) {
        System.out.print("정수를 입력하세요 : ");
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        if (input <= 0) {
            System.out.println("0보다 커야 합니다.");
        }
        else{
            for(int i=input;i>0;i--){
                for(int j=0;j<i;j++){
                    System.out.print("#");
                }
                System.out.println();
            }
        }

    }
}
