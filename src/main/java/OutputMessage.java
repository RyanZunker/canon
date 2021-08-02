public class OutputMessage implements  iOutputMessage{
    public String theOutput(int numTries){
        return "You hit the target in " + numTries + " tries";
    }
}
