import java.util.Random;

public class Target implements iTarget{
    private int x;
    private int y;
    public Target(){
        Random random = new Random();
        x = random.nextInt(9) + 1;
        y = random.nextInt(9) + 1;
        System.out.println("Target created at " + x + " , " + y);
    }

    public int getX(){
        return x;
    }

    public int getY() {
        return y;
    }
}
