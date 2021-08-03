public class OutputMessage implements  iOutputMessage{
    public String roundOutput(int numTries){
        return "You hit the target in " + numTries + " tries";
    }
    public String gameOutput(int numTries){
        return "You won the game in " + numTries + " shots";
    }
}
