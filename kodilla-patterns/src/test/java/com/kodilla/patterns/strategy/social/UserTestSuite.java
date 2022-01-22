package com.kodilla.patterns.strategy.social;

import com.kodilla.patterns.strategy.social.channel.TwitterPublisher;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UserTestSuite {

    @Test
    void testDefaultSharingStrategies() {
        //Given
        User john = new Millenials("John");
        User david = new YGeneration("David");
        User cash = new ZGeneration("Cash");

        //When
        String johnUses = john.sharePost();
        System.out.println("John uses channel: " + johnUses);
        String davidUses = david.sharePost();
        System.out.println("David uses channel: " + davidUses);
        String cashUses = cash.sharePost();
        System.out.println("Cash uses channel: " + cashUses);

        //Then
        assertEquals("Facebook", johnUses);
        assertEquals("Snapchat", davidUses);
        assertEquals("Twitter", cashUses);
    }

    @Test
    void testIndividualSharingStrategy() {
        //Given
        User john = new Millenials("John");

        //When
        john.setChannel(new TwitterPublisher());
        String johnUses = john.sharePost();
        System.out.println("John now uses channel: " + johnUses);

        //Then
        assertEquals("Twitter", johnUses);
    }
}