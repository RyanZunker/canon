public class Judge implements iJudge {
    @Override
    public boolean isAHit(iTarget target, iShot shot) {
       if(target.getX() == shot.getX() && target.getY() == shot.getY()){
           return true;
       }
       return false;
    }
}
