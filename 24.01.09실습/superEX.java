class Point2 extends Point{
    public Point2(int x, int y){
        super.set(x,y);
    }
}
class Colorpoint2 extends ColorPoint{
    public Colorpoint2(int x, int y, String color){
        super.setColor(color);
        super.set(x,y);
    }
}

public class superEX {
    public static void main(String[] args){
        Colorpoint2 cp = new Colorpoint2(5,6,"blue");
        cp.showColorPoint();
    }
}
