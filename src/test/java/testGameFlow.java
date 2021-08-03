import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.BDDMockito.given;
import static org.mockito.Mockito.*;
public class testGameFlow {
    @Test
    public void aGameHasFiveRounds(){
        //given the game started
        //when we create the game flow class
        iScore mockScore = mock(Score.class);
        iOutputMessage mockOutputMessage = mock(OutputMessage.class);
        iRoundFlow mockRound = mock(iRoundFlow.class);
        iGameFlow game = new GameFlow(mockScore, mockOutputMessage, mockRound);

        //then we play 5 rounds
        verify(mockOutputMessage, times(1)).gameOutput(anyInt());
    }

    /*@Test
    public void aGameHasAnOutput(){
        //given the game started
        //when we create the game flow class
        iGameFlow game = new GameFlow();
        iRoundFlow mockRound = mock(iRoundFlow.class);
        given(mockRound.getRoundScore()).willReturn(1);
        //then we play 5 rounds
        verify(mockRound, times(5)).getRoundScore();
    }*/
}
