package de.consol.devday.talk.service;

import org.junit.Assert;
import org.junit.Test;

public class TalkServiceTest {

    @Test
    public void testGetEvents() {
        TalkService ts = new TalkService();
        Assert.assertEquals(6,ts.getEvents().size());
    }

    @Test
    public void testPrefix() {
        Assert.assertEquals(TalkService.prefix("blah blah"), "Talk: blah blah");
    }

}
