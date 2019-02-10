package lab2;

import static org.junit.Assert.*;

import org.junit.Test;
/**
 * JUnit tests for RulesOf6005.
 */
public class Rulesof6005Test {
    
    /**
     * Tests the mayUseCodeInAssignment method.
     */
    @Test
    public void testMayUseCodeInAssignment() {
        assertFalse("Expected false: un-cited publicly-available code",
                Rulesof6005.mayUseCodeInAssignment(false, true, false, false, false));
        assertTrue("Expected true: self-written required code",
                Rulesof6005.mayUseCodeInAssignment(true, false, true, true, true));
    }
}
