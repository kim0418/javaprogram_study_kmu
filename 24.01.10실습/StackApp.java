import java.util.Scanner;

interface Stack{
    int length();
    int capacity();
    String pop();
    boolean push(String val);
}
class Stringstack implements Stack{
    String[] myStack;
    int top=-1;
    int stackSize;
    @Override
    public int length(){
        Scanner scanner = new Scanner(System.in);
        int Size=scanner.nextInt();
        return Size;
    }
    @Override
    public int capacity(){
        return top++;
    }
    @Override
    public String pop(){
        String top_ward=myStack[top];
        top--;
        return top_ward;
    }
    @Override
    public boolean push(String val){
        myStack[top]=val;
        return true;
    }
}

public class StackApp{
    public static void main(String[] args) {
        Stringstack stringstack = new Stringstack();
        System.out.print("총 스택 저장곤간의 크기 입력 >> ");
        stringstack.stackSize=stringstack.length();
        stringstack.myStack=new String[stringstack.stackSize];
        Scanner scanner = new Scanner(System.in);
        while(true){
            System.out.print("문자열 입력 >> ");
            String input = scanner.nextLine();
            if(input.equals("그만")) break;
            if(stringstack.top<(stringstack.stackSize-1)){
                stringstack.capacity();
                stringstack.push(input);
            }
            else if(stringstack.top==(stringstack.stackSize-1)){
                System.out.println("스택이 가득차서 푸시 불가");
            }
        }
        System.out.print("스택에 저장된 문자열 POP >> ");
        for(int i=stringstack.top;i>-1;i--){
            System.out.print(stringstack.pop()+" ");
        }
    }
}