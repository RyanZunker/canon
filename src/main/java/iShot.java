public interface iShot {
    public int getX();
    public int getY();
    public int convertShotToXCord(int angle, int velocity);
    public int convertShotToYCord(int angle, int velocity);
    public void printLocation();
}
