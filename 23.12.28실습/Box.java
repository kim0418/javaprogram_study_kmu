import java.util.Scanner;

public class Box {
    public static void Sales_manager(int size, int total){
        System.out.println("you need box : " + total/size);
        System.out.println("you extra fruit : " + total%size);
    }
    public static void main(String[] args){
        System.out.println("박스 하나당 담을수 있는 개수와 전체 오렌지 개수를 입력하시오.");
        Scanner sales = new Scanner(System.in);
        int box_size= sales.nextInt();
        int Orange=sales.nextInt();
        Sales_manager(box_size,Orange);
    }
}
