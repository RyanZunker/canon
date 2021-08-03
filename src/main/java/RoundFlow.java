import java.io.IOException;

public class RoundFlow implements  iRoundFlow {
    iTarget target;
    iGetInput getInput;
    iInputValidator inputValidator;
    iShot shot;
    iCounter counter;
    iJudge judge;
    iOutputMessage outputMessage;
    iScore score;

    public RoundFlow(){
        target = new Target();
        getInput = new GetInput();
        inputValidator = new InputValidator();
        counter = new Counter();
        judge = new Judge();
        outputMessage = new OutputMessage();
        score = new Score();
    }

    public void start() throws IOException {

        boolean shotHasNotHit = true;

        while(shotHasNotHit){
            String angleInput = null;
            String velocityInput = null;

            int angle = 0;
            int velocity = 0;

            boolean yetToGetValidInput = true;
            while(yetToGetValidInput){
                //call the inputs
                getInput.getAngleMessage();
                angleInput = getInput.getTheInput();
                getInput.getVelocityMessage();
                velocityInput = getInput.getTheInput();


                //validate the inputs
                yetToGetValidInput = !inputValidator.isValid(angleInput, velocityInput);

            }

            //handle after shot stuff
            angle = Integer.parseInt(angleInput);
            velocity = Integer.parseInt(velocityInput);
            counter.increment();
            shot = new Shot(angle,velocity);
            shot.printLocation();
            shotHasNotHit = !judge.isAHit(target,shot);
        }
        System.out.println(outputMessage.roundOutput(counter.getValue()));
        score.addToScore(counter.getValue());
    }

    public int getRoundScore(){
        return score.getScore();
    }
}
