import java.util.Scanner;

public class ChageMoney {
    public static void main(String[] args){
        Scanner money = new Scanner(System.in);
        int price = money.nextInt();
        System.out.println("오만원권 " + price/50000 + "개");
        price%=50000;
        System.out.println("만원권 " + price/10000 + "개");
        price%=10000;
        System.out.println("천원권 " + price/1000 + "개");
        price%=1000;
        System.out.println("오백원 " + price/500 + "개");
        price%=500;
        System.out.println("백원 " + price/100 + "개");
        price%=100;
        System.out.println("오십원 " + price/50 + "개");
        price%=50;
        System.out.println("십원 " + price/10 + "개");
        price%=10;
        System.out.println("일원 " + price + "개");
    }
}
