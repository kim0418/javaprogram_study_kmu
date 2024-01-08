import java.util.Scanner;

class Grade{
    private int math;
    private int science;
    private int english;
    public int average(int score1, int score2, int score3){
        math=score1;
        science=score2;
        english=score3;
        return (math+science+english)/3;
    }
}

public class GradeArray {
    public static void main(String[] args){
        Grade student_class = new Grade();
        Scanner scanner =  new Scanner(System.in);
        System.out.print("수학,과학,영어 순으로 성적 입력 >> ");
        int avg = student_class.average(scanner.nextInt(),scanner.nextInt(),scanner.nextInt());
        scanner.close();
        System.out.println("평균은 " + avg);
    }
}