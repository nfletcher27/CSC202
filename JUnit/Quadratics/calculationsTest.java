import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class calculationsTest {

    @Test
    void quadraticTestOne() {
        var calculation = new quadraticCalculator();
        quadraticCalculator.quadraticRoots(1, 4, 5);
        assertEquals(1, 2 - 1);
    }

    @Test
    void testingAssertions() {
        assertEquals(44, 22 + 22);
        assertEquals(22, 11 + 11);
        boolean test = false;
        assertTrue(test);
    }
}
