import java.util.Scanner;

public class ScoreArray {
    public static void main(String[] args){
        String course[] = {"Java","C++","HTML5","컴퓨터구조","안드로이드"};
        int score[] = {95,88,76,62,55};

        System.out.println("want exit, press 'exit'");
        while(true){
            Scanner scanner =new Scanner(System.in);
            System.out.print("과목이름 >>> ");
            String class_name = scanner.nextLine();
            if(class_name.equals("exit"))
                break;
            for(int i=0;i<course.length;i++){
                if(class_name.equals(course[i])){
                    System.out.println(class_name+"의 점수는 "+score[i]);
                }
                if(i==course.length-1 && !class_name.equals(course[i])){
                    System.out.println("없는 과목입니다.");
                }
            }
        }
    }
}
