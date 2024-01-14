import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Vector;


public class HashMapDicEx{
    public static void main(String[] args) {
        HashMap<String,String> dic = new HashMap<String,String>();

        dic.put("baby","아기");
        dic.put("love", "사랑");
        dic.put("apple", "사과");

        Scanner scanner = new Scanner(System.in);
        while(true){
            System.out.println("찾고싶은단어는? : ");
            String eng = scanner.next();
            if(eng.equals("exit")){
                System.out.println("종료합니다.");
            }
            
            String kor = dic.get(eng);
            if(kor==null){
                System.out.println("없는단어입니다.");
            }
            else{
                System.out.println(kor);
            }
            scanner.close();   
        }
    }
}