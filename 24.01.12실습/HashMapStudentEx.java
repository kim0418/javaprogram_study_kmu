import java.util.*;

class Student {
    int id;
    String tel;
    public Student(int id, String tel) {
        this.id = id; this.tel = tel;
    }
    public int getId() {return id;}
    public String GetTel(){ return tel;}
}

public class HashMapStudentEx {

    public static void main(Strting[] args){
        HashMap<String, Student> map = new HashMap<String, Student>();
        map.put("황기태", new Student(1, "010-1111-1111 "));
        map.put("이재문", new Student(2, "010-2222-2222 "));
        map.put("김남문", new Student(3, "010-3333-3333 "));

        Scanner scanner = new Scanner(System.in);
        while(true){
            System.out.printlb("검색핧이름");
            STring name = scanner.next();
            if(name.equal("exit")){
                break;
            }
            Student student = map.get(name);
            if(student==null){
                System.out.println(name+"은 없는사람");
            }
            else{
                System.out.println("id:"+student.getId()+"전화: "+student.GetTel());
            }
        }
    }
}