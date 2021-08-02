import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.BDDMockito.given;
import static org.mockito.Mockito.*;
public class testFlow {
    @Test
    public void onInitializationIsTargetCreated(){
        //given the game started
        //when we create flow class
        iFlowClass flow = new FlowClass();
        //then we create a target
        assertTrue(flow.target instanceof Target);
    }
    /*@Test
    public void onStartGetInputCalled() throws IOException {
        //given the game started
        //when we create flow class and call start
        iFlowClass flow = new FlowClass();
        iGetInput getInput = mock(GetInput.class);
        given(getInput.getTheInput()).willReturn("hi");
        //then we create a target
        verify(getInput, times(2)).getTheInput();
    }*/

}
