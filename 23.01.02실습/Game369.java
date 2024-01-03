public class Game369 {
    public static void main(String[] args){
        int i=1;
        while (i<=50){
            String invert_string = Integer.toString(i);
            if(invert_string.contains("3") || invert_string.contains("6") || invert_string.contains("9")){
                System.out.println(invert_string+" 박수짝");
            }
            i++;
        }
    }
}
