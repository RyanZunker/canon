import java.io.IOException;

public class FlowClass implements  iFlowClass {
    iTarget target;
    iGetInput getInput;
    iInputValidator inputValidator;
    iShot shot;
    iCounter counter;
    iJudge judge;
    iOutputMessage outputMessage;

    public FlowClass(){
        target = new Target();
        getInput = new GetInput();
        inputValidator = new InputValidator();
        counter = new Counter();
        judge = new Judge();
        outputMessage = new OutputMessage();
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
            shotHasNotHit = !judge.isAHit(target,shot);
        }
        outputMessage.theOutput(counter.getValue());
    }

}
