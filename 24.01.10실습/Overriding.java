class weapon{
    protected int fire(){
        return 1;
    }
}

class Cannon extends weapon{
    @Override
    protected int fire(){
        return 10;
    }
}

public class ScoreArray{
    public static void main(String[] args) {
        weapon Weapon;
        Weapon=new weapon();
        System.out.println(Weapon.fire());

        Weapon=new Cannon();
        System.out.println(Weapon.fire());
    }
}