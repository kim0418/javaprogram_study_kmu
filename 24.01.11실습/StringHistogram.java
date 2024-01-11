import java.util.Scanner;

public class StringHistogram{
    static String readString(){
        StringBuffer sb=new StringBuffer();
        Scanner scanner = new Scanner(System.in);
        while(true){
            String line = scanner.nextLine();
            if(line.equals(";"))
                break;
            sb.append(line);
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        int[] Alphabet_count = new int[26];

        System.out.println("영문 텍스트를 입력하고 세미콜론을 입력하세요.");
        String total=readString();
        for(char ch : total.toCharArray()) {
            if(Character.isLetter(ch)) {
                Alphabet_count[Character.toUpperCase(ch) - 'A']++;
            }
        }
        for(int i=0;i<Alphabet_count.length;i++){
            System.out.print((char)('A'+i) +" : ");
            for(int j=0; j<Alphabet_count[i]; j++){
                System.out.print("-");
            }
            System.out.println();
        }
    }
}