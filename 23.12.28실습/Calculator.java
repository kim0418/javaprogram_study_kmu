import java.util.Scanner;

public class Calculator {
    final static double tax=0.1;
    public static void calculator(int prize, int money){
        System.out.println("Tax : " + (int)(prize*tax));
        System.out.println("extra : " + (money-prize));
    }
    public static void main(String[] args){
        System.out.println("Prize and Money");
        Scanner Customer = new Scanner(System.in);
        int prize=Customer.nextInt();
        int money = Customer.nextInt();
        calculator(prize,money);
    }
}
