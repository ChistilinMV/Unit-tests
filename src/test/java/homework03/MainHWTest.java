package homework03;

import homework03.MainHW;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import static org.junit.jupiter.api.Assertions.assertTrue;

class MainHWTest {
    @ParameterizedTest
    @ValueSource(ints = {2, 20, 55})
    public void evenOddNumberTest(int numb) {
        assertTrue(MainHW.evenOddNumber(numb));
    }	
	
	@ParameterizedTest
    @ValueSource(ints = {30, 99, 100, 25})
    public void numberInIntervalTest(int numb) {
        assertTrue(MainHW.numberInInterval(numb));
    }	
}