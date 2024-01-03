import java.util.Arrays;
import java.util.Scanner;

public class ScoreArray {
    public static void main(String[] args){
        String course[] = {"Java","C++","HTML5","컴퓨터구조","안드로이드"};
        int score[] = {95,88,76,62,55};
        Scanner scanner =new Scanner(System.in);

        System.out.println("want exit, press 'exit'");
        while(true){
            System.out.print("과목이름 >>> ");
            String class_name = scanner.nextLine();
            if(class_name.equals("exit"))
                break;
            if(searcher(course,class_name)==-1){
                System.out.println("없는 과목 입니다.");
            }
            else{
                System.out.println(class_name + "의 점수는 " + score[searcher(course,class_name)]);
            }
        }
        scanner.close();
    }
    public static int searcher(String[] arr,String target){
        for(int i=0;i<arr.length;i++){
            if(arr[i].equals(target)){
                return i;
            }
        }
        return -1;
    }
}
