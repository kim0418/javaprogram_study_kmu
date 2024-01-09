class TV{
    private int size;
    public TV(int size){this.size=size;}
    protected int getSize(){return size;}
}
class ColorTV extends TV{
    int color;
    public ColorTV(int size, int color){
        super(size);
        this.color=color;
    }
    public void printProperty(){
        System.out.println(super.getSize()+"인치 "+color+"컬러");
    }
}
class IPTV extends ColorTV{
    String ipAddr;
    public IPTV(String ipAddr,int size, int color){
        super(size,color);
        this.ipAddr=ipAddr;
    }
    public void printProperty(){
        System.out.println("나의 IPTV는 "+ipAddr+"주소의 "+super.getSize()+"인치 "+color+"컬러");
    }
}

public class TvArray {
    public static void main(String[] args){
        ColorTV myTV = new ColorTV(32,1024);
        myTV.printProperty();
        IPTV iptv=new IPTV("192.1.1.2",32,2048);
        iptv.printProperty();
    }
}
