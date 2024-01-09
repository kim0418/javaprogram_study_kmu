class person{
    private int weight;
    int age;
    protected int height;
    public String name;
    public void setWeight(int weight){
        this.weight=weight;
    }
    public int getWeight(){
        return weight;
    }
}
class Student extends person{
    public void set(){
        age=3;
        name="홍길동";
        height=175;
        setWeight(99);
    }
}

public class InheritanceEX {
    public static void main(String[] args) {
        Student s = new Student();
        s.set();
    }
}
