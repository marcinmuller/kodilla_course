package com.kodilla.patterns.singleton;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Marcin Muller on 17.08.17.
 */
public class LoggerTestSuite {
    @Test
    public void testOne() {
        //given
        Logger logger = Logger.getInstance();
        //when
        logger.log("something");
        String log = logger.getLastLog();
        //then
        Assert.assertEquals("something",log);
    }
}
