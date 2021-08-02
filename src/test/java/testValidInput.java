import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.BDDMockito.given;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class testValidInput {
    @Test
    public void givenAngle0AndVelocity1ReturnTrue() throws IOException {
        //given angle of 0 and velocity of 1
        GetInput mockInput = mock(GetInput.class);
        when(mockInput.getTheInput()).thenReturn("0").thenReturn("1");
        //when it is called
        iInputValidator inputValidator = new InputValidator();
        String angle = mockInput.getTheInput();
        String velocity = mockInput.getTheInput();
        boolean isValid = inputValidator.isValid(angle, velocity);
        //then return true
        assertTrue(isValid);
    }

    @Test
    public void givenAngleABCAndVelocity1ReturnFalse() throws IOException {
        //given angle of 0 and velocity of 1
        GetInput mockInput = mock(GetInput.class);
        when(mockInput.getTheInput()).thenReturn("ABC").thenReturn("1");
        //when it is called
        iInputValidator inputValidator = new InputValidator();
        String angle = mockInput.getTheInput();
        String velocity = mockInput.getTheInput();
        boolean isValid = inputValidator.isValid(angle, velocity);
        //then return true
        assertTrue(!isValid);
    }

    @Test
    public void givenAngle0AndVelocityABCReturnFalse() throws IOException {
        //given angle of 0 and velocity of 1
        GetInput mockInput = mock(GetInput.class);
        when(mockInput.getTheInput()).thenReturn("0").thenReturn("ABC");
        //when it is called
        iInputValidator inputValidator = new InputValidator();
        String angle = mockInput.getTheInput();
        String velocity = mockInput.getTheInput();
        boolean isValid = inputValidator.isValid(angle, velocity);
        //then return true
        assertTrue(!isValid);
    }

    @Test
    public void givenAngle270AndVelocity1ReturnFalse() throws IOException {
        //given angle of 0 and velocity of 1
        GetInput mockInput = mock(GetInput.class);
        when(mockInput.getTheInput()).thenReturn("270").thenReturn("1");
        //when it is called
        iInputValidator inputValidator = new InputValidator();
        String angle = mockInput.getTheInput();
        String velocity = mockInput.getTheInput();
        boolean isValid = inputValidator.isValid(angle, velocity);
        //then return true
        assertTrue(!isValid);
    }

    @Test
    public void givenAngle0AndVelocity0ReturnFalse() throws IOException {
        //given angle of 0 and velocity of 1
        GetInput mockInput = mock(GetInput.class);
        when(mockInput.getTheInput()).thenReturn("0").thenReturn("0");
        //when it is called
        iInputValidator inputValidator = new InputValidator();
        String angle = mockInput.getTheInput();
        String velocity = mockInput.getTheInput();
        boolean isValid = inputValidator.isValid(angle, velocity);
        //then return true
        assertTrue(!isValid);
    }

    @Test
    public void givenAngle270AndVelocity0ReturnFalse() throws IOException {
        //given angle of 0 and velocity of 1
        GetInput mockInput = mock(GetInput.class);
        when(mockInput.getTheInput()).thenReturn("0").thenReturn("0");
        //when it is called
        iInputValidator inputValidator = new InputValidator();
        String angle = mockInput.getTheInput();
        String velocity = mockInput.getTheInput();
        boolean isValid = inputValidator.isValid(angle, velocity);
        //then return true
        assertTrue(!isValid);
    }

    @Test
    public void givenAngleMinus10AndVelocity1ReturnFalse() throws IOException {
        //given angle of 0 and velocity of 1
        GetInput mockInput = mock(GetInput.class);
        when(mockInput.getTheInput()).thenReturn("-10").thenReturn("1");
        //when it is called
        iInputValidator inputValidator = new InputValidator();
        String angle = mockInput.getTheInput();
        String velocity = mockInput.getTheInput();
        boolean isValid = inputValidator.isValid(angle, velocity);
        //then return true
        assertTrue(!isValid);
    }

    @Test
    public void givenAngle10AndVelocityMinus22ReturnFalse() throws IOException {
        //given angle of 0 and velocity of 1
        GetInput mockInput = mock(GetInput.class);
        when(mockInput.getTheInput()).thenReturn("10").thenReturn("-22");
        //when it is called
        iInputValidator inputValidator = new InputValidator();
        String angle = mockInput.getTheInput();
        String velocity = mockInput.getTheInput();
        boolean isValid = inputValidator.isValid(angle, velocity);
        //then return true
        assertTrue(!isValid);
    }
}
