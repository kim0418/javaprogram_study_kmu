class Pen{
    int amount;
    String color;
    public int getAmount(){return amount;}
    public void setAmount(int amount) {
        this.amount = amount;
    }
    public String getColor(){return color;}
    public void setColor(String color) {
        this.color = color;
    }
}

class Ballpen extends Pen{}
class SharpPencil extends Pen{
    private int width;
}
class FountainPen extends Pen{
    public void refill(int n){
        super.setAmount(n);
    }
}