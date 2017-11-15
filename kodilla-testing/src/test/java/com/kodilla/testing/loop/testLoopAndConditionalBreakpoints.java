package com.kodilla.testing.loop;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Marcin Muller on 14.11.17.
 */
public class testLoopAndConditionalBreakpoints {
    @Test
    public void testLoop(){
        //given
        long sum=0;
        //when
        for (int n=0;n<1000;n++){
            sum+=n;
            System.out.println("sum["+n+"]="+sum);
        }
        //then
        Assert.assertEquals(499500,sum);
    }
}
