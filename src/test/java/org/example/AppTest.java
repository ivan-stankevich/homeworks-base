package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Unit test for simple App.
 */
public class AppTest {
    /**
     * Rigorous Test :-)
     */
    @Test
    public void zeroLessThanOne() {
        int max = App.max(1,0);
        assertEquals(1,max);
        }

    @Test
    public void zeroLessThanOneReversed() {
        int max = App.max(0,1);
        assertEquals(1,max);
    }
}
