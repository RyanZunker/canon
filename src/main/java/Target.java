import java.util.Random;

public class Target implements iTarget{
    private int x;
    private int y;
    public Target(){
        Random random = new Random(0);
        x = random.nextInt(9) + 1;
        y = random.nextInt(9) + 1;
    }

    public int getX(){
        return x;
    }

    public int getY() {
        return y;
    }
}
