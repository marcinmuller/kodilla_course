package com.kodilla.stream.array;

import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.SystemOutRule;

/**
 * Created by Marcin Muller on 31.07.17.
 */
public class ArrayOperationsTestSuite {
    @Rule
    public /*final*/ SystemOutRule systemOutRule = new SystemOutRule().enableLog();
    @Test
    public void testGetAverage(){
        //Given
        int[] array={1,2,3,8,5,7,8,3,33,44,23,124,0};
        //when
        double result=ArrayOperations.getAverage(array);
        //then
        Assert.assertTrue(systemOutRule.getLog().contains("1\n2\n3\n8\n5\n7\n8\n3\n33\n44\n23\n124\n0\n20.0"));
        Assert.assertEquals(20.076,result,0.001);
    }
}
