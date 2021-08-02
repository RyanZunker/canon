public class Shot implements iShot{
   int x;
   int y;

    @Override
    public int convertShotToXCord(int angle, int velocity) {
        double temp = velocity * Math.cos(angle);
        int value = (int)Math.round(temp);
        return value;
    }

    public int convertShotToYCord(int angle, int velocity){
        double temp = velocity * Math.sin(angle);
        int value = (int)Math.round(temp);
        return value;
    }

    public int getX(){
        return this.x;
    }

    public int getY(){
        return this.y;
    }

    public Shot(int angle, int velocity){
        this.x = this.convertShotToXCord(angle, velocity);
        this.y =  this.convertShotToYCord(angle, velocity);

    }

}
