import java.util.Scanner;
import java.util.SimpleTimeZone;

class Dictionary{
    private static String [] kor={"사랑","아기","돈","미래","희망"};
    private static String[] eng={"love","baby","money","future","hope"};
    public static String kor2Eng(String word){
        for(int i=0;i<kor.length;i++){
            if(kor[i].equals(word)){
                return eng[i];
            }
        }
        return "없음";
    }
}

public class DicApp {
    public static void main(String[] args){
        System.out.println("한영 단어 검색 프로그램입니다.");
        Scanner scanner = new Scanner(System.in);
        while(true) {
            System.out.print("검색(한글 -> 영문) >> ");
            String word = scanner.nextLine();
            if (word.equals("그만")){
                break;
            }
            String result = Dictionary.kor2Eng(word);
            if(result.equals("없음")){
                System.out.println(word+"는 사전에 존재에 없습니다.");
            }
            else{
                System.out.println(word+"는 "+result);
            }
        }
        scanner.close();
    }
}