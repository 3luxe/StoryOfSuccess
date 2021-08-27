package algo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TryWhileAsLoopTest {
    public TryWhileAsLoop testClass = new TryWhileAsLoop();

    @Test
    void generatedListHasProperSize() {
        assertEquals(10, testClass.generateList().size());
    }

    @Test
    void generatedListHasProperHeadItem() {
        assertSame(testClass.algorythms, testClass.generateList().get(0));
    }

    @Test
    void generatedListHasTheSameElements() {
        assertTrue(testClass.generateList().stream().allMatch(testClass.algorythms::equals));
    }
}