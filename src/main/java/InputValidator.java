public class InputValidator implements iInputValidator {
    @Override
    public boolean isValid(String angle, String velocity) {
        try{
            int angleValue = Integer.parseInt(angle);
            int velocityValue = Integer.parseInt(velocity);

            if(angleValue>=0 && angleValue<=90){
                if(velocityValue>=1 && velocityValue<=20){
                    return true;
                }
            }
            return false;
        }
        catch(NumberFormatException e){
            return false;
        }
        catch(NullPointerException e){
            return false;
        }
    }
}
