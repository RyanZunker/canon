import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        Score score = new Score();
        OutputMessage outputMessage = new OutputMessage();
        iRoundFlow roundFlow = null;
        GameFlow game = new GameFlow(score, outputMessage, roundFlow);
        game.start();
    }
}
