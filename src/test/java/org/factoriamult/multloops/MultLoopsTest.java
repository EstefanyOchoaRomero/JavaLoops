package org.factoriamult.multloops;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class MultLoopsTest {

    MultLoops mult = new MultLoops();

    @Test
    public void testTableMultLoopsCero() {

        MultLoops multLoops = new MultLoops();

        //given
        int n = 5;
        //when

        String[] result = multLoops.mult(n);

        //then
        assertEquals("5x1=5", result[0]);
        assertEquals("5x2=10", result[1]);
        assertEquals("5x3=15", result[2]);
        assertEquals("5x4=20", result[3]);
        assertEquals("5x5=25", result[4]);
        assertEquals("5x6=30", result[5]);
        assertEquals("5x7=35", result[6]);
        assertEquals("5x8=40", result[7]);
        assertEquals("5x9=45", result[8]);
        assertEquals("5x10=50", result[9]);

    }

}
