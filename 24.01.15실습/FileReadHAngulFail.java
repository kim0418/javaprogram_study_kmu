import java.io.*;

public class FileReadHAngulFail{
    public static void main(String[] args) {
        InputStreamReader in = null;
        FileInputStream fn = null;
        try{
            fn=new FileInputStream("c:\\Temp\\hangul.txt");
            in = new InputStreamReader(fn,"US-ASCII");
            int c;

            System.out.println(in.getEncoding());
            while((c=in.read())!=-1){
                System.out.println((char)c);
            }
            in.close();
            fn.close();
        }
        catch (IOException e) {
            System.out.println("오류");
        }
    }
}