import java.util.Scanner;

public class Study3 {
    public static void study(String args){
        System.out.println("??"+args+"??");
    }
    public static void  main(String[] args){
        byte b=127;
        int i=100;

        final double pi=3.141592;
        Scanner radius=new Scanner(System.in);
        System.out.println(radius.next());
        System.out.println(b+i);
        System.out.println(10/4);
        System.out.println(10.0/4);
        System.out.println((char)0x12340041);
        System.out.println((byte)(b+i));
        System.out.println((int)2.9+1.8);
        System.out.println((int)(2.9+1.8));
        System.out.println((int)2.9+(int)1.8);


    }
}
