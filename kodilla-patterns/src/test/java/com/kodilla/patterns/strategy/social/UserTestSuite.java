package com.kodilla.patterns.strategy.social;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Marcin Muller on 18.08.17.
 */
public class UserTestSuite {
    @Test
    public void testDefaultSharingStrategies(){
        //given
        User z=new ZGeneration();
        User y=new YGeneration();
        User mill=new Millenials();
        //when
        String zResult=z.sharePost();
        String yResult=y.sharePost();
        String millResult=mill.sharePost();
        //then
        Assert.assertEquals("sharing through Twitter",yResult);
        Assert.assertEquals("sharing through Snapchat",zResult);
        Assert.assertEquals("sharing through Facebook",millResult);
    }
    @Test
    public void testIndividualSharingStrategy(){
        //given
        User mill=new Millenials();
        //when
        String result1=mill.sharePost();
        mill.setPublisher(new SnapchatPublisher());
        String result2=mill.sharePost();
        //then
        Assert.assertEquals("sharing through Facebook",result1);
        Assert.assertEquals("sharing through Snapchat",result2);

    }
}
