import java.io.IOException;

public class GameFlow implements iGameFlow{
    iScore score;
    iOutputMessage outputMessage;
    iRoundFlow roundFlow;
    public GameFlow(iScore score, iOutputMessage outputMessage, iRoundFlow roundFlow){
        this.score = score;
        this.outputMessage = outputMessage;
        this.roundFlow = roundFlow;
    }

    public void start() throws IOException {
        int numShots = 5;

        for(int round = 1; round <= numShots; round++){
            roundFlow = new RoundFlow();
            roundFlow.start();
            score.addToScore(roundFlow.getRoundScore());
        }
        System.out.println(outputMessage.gameOutput(score.getScore()));
    }
}
