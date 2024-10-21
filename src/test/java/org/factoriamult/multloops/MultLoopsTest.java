package org.factoriamult.multloops;


import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class MultLoopsTest {

    MultLoops mult = new MultLoops();

    
    @Test
    public void testTableMultLoopsCero() {

        
        MultLoops multLoops = new MultLoops();

        //given

        int  n = 5;
        //when

        String[] result = multLoops.mult(n);


        //then
        assertEquals("5x1=5", result[0]);

    }


}



