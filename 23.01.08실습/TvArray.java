class TV{
    private String manufacturer;
    private int size;
    /*public TV(){
        size=32;
        manufacturer="LG";
        System.out.println(size+"인치"+manufacturer);
    }*/
    public TV(){
        //this를 이용하여 원본코드 변경
        this(32,"LG");
    }
    public TV(String manufacturer){
        this.size=32;
        this.manufacturer=manufacturer;
        System.out.println(size+"인치"+manufacturer);
    }
    public TV(int size, String manufacturer){
        this.size=size;
        this.manufacturer=manufacturer;
        System.out.println(this.size+"인치"+this.manufacturer);
    }
}

public class TvArray {
    public static void main(String[] args){
        TV a=new TV();
        TV b=new TV("삼성");
        TV SSamsong = new TV(65,"삼성");
    }
}