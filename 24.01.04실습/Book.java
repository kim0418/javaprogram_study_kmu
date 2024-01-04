public class Book {
    String titile;
    String author;

    void show(){System.out.println(titile + " "+author);}

    public Book(){
        this("","");
        System.out.println("생성자 호출됨");
    }
    public Book(String title){
        this(title,"작자미상");
    }
    public Book(String title, String author){
        this.titile=title;
        this.author=author;
    }

    public static void main(String[] args){
        Book littlePrince=new Book("어린왕자","생텍쥐베리");
        Book loveStory = new Book("춘향전");
        Book emptyBook = new Book();
        loveStory.show();
    }
}
