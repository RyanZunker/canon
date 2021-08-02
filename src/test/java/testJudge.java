import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.BDDMockito.given;
import static org.mockito.Mockito.*;

public class testJudge{
    @Test
    public void testGivenTargetAndShotPassReturnTrue() {
        //Given: i have a shot and target
        iTarget mockTarget = mock(iTarget.class);
        iShot mockShot = mock(iShot.class);
        //When: i have a shot (1,1) and target (1,1)
        given(mockShot.getX()).willReturn(1);
        given(mockShot.getY()).willReturn(1);
        given(mockTarget.getX()).willReturn(1);
        given(mockTarget.getY()).willReturn(1);
        //Then: it returns true
        iJudge judge = new Judge();
        assertTrue(judge.isAHit(mockTarget, mockShot));
    }
    @Test
    public void testGivenTargetAndShotFailReturnFalse() {
        //Given: i have a shot and target
        iTarget mockTarget = mock(iTarget.class);
        iShot mockShot  = mock(iShot.class);
        //when: i have a shot (1,1) and target(2,2)
        given(mockShot.getX()).willReturn(1);
        given(mockShot.getY()).willReturn(1);
        given(mockTarget.getX()).willReturn(2);
        given(mockTarget.getY()).willReturn(2);
        //Then: it returns false
        iJudge judge = new Judge();
        assertTrue(!judge.isAHit(mockTarget, mockShot));
    }

    @Test
    public void testGivenTargetAndShotFailOutOfBoundsReturnFalse() {
        //Given: i have a shot and target
        iTarget mockTarget = mock(iTarget.class);
        iShot mockShot  = mock(iShot.class);
        //when: i have a shot (1,1) and target(2,2)
        given(mockShot.getX()).willReturn(1);
        given(mockShot.getY()).willReturn(11);
        given(mockTarget.getX()).willReturn(2);
        given(mockTarget.getY()).willReturn(2);
        //Then: it returns false
        iJudge judge = new Judge();
        assertTrue(!judge.isAHit(mockTarget, mockShot));
    }
}


