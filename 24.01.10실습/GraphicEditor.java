import java.util.Scanner;

abstract class Shape {
    private Shape next;
    public Shape(){next=null;}
    public void setNext(Shape obj){next=obj;}
    public Shape getNext(){return next;}
    public abstract void draw();
}
class Line extends Shape {
    @Override
    public void draw(){
        System.out.println("line");
    }
}
class Rect extends Shape {
    @Override
    public void draw(){
        System.out.println("rect");
    }
}
class Circle extends Shape {
    @Override
    public void draw(){
        System.out.println("circle");
    }
}

class Manager{
    private static Shape head;
    private static Shape tail;
    public Manager(){
        head=null;
        tail=null;
    }
    public static void insert(int n){
        Shape s;
        switch (n) {
            case 1:
                s = new Line();
                break;
            case 2:
                s = new Rect();
                break;
            case 3:
                s = new Circle();
                break;
            default:
                System.out.println("1~3 중 선택하시오.");
                return;
        }
        if (head == null) {
            head = s;
            tail = s;
        }
        else {
            tail.setNext(s);
            tail = s;
        }
    }
    public static void delete(int idx){
        Shape tmp = head;
        if(idx==1){
            head = tmp.getNext();
        }else{
            Shape prev = null;
            for(int i=1; i<idx; i++){
                prev = tmp;
                tmp = tmp.getNext();
                if(tmp == null){
                    System.out.println("삭제할 도형이 없습니다.");
                    return;
                }
            }
            prev.setNext(tmp.getNext());
        }
    }
    public static void showAll(){
        Shape tmp = head;
        while(tmp!=null){
            tmp.draw();
            tmp = tmp.getNext();
        }
    }
}

public class GraphicEditor{

    public static void main(String[] args) {
        System.out.println("그래픽 에디터 beauty를 실행합니다.");
        Scanner scanner = new Scanner(System.in);
        Manager manager=new Manager();
        while(true){
            System.out.print("삽입(1),삭제(2),모두보기(3),종료(4) >>> ");
            int select = scanner.nextInt();
            switch (select){
                case 1:
                    System.out.print("Line(1), Rect(2), Circle(3) >> ");
                    int item=scanner.nextInt();
                    Manager.insert(item);
                    break;
                case 2:
                    System.out.print("삭제할 도형의 위치 >> ");
                    int idx=scanner.nextInt();
                    Manager.delete(idx);
                    break;
                case 3:
                    Manager.showAll();
                    break;
                case 4:
                    System.out.println("그래픽 에디터 beauty를 종료합니다.");
                    System.exit(0);
                    break;
                default:
                    System.out.println("다시 선택해 주세요.");
                    break;
            }
        }
    }
}