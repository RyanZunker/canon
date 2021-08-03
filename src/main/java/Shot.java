public class Shot implements iShot{
   int x;
   int y;

    @Override
    public int convertShotToXCord(int angle, int velocity) {
        double temp = velocity * Math.cos(Math.toRadians(angle));
        int value = (int)Math.round(temp);
        return value;
    }

    public int convertShotToYCord(int angle, int velocity){
        double temp = velocity * Math.sin(Math.toRadians(angle));
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

    @Override
    public void printLocation() {
        System.out.println("The shot landed at " + getX() + "," + getY());
    }
}
