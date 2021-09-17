package com.bridgelab;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MoodTesting {

    //sad mood test case
    @Test
    public void givingSadMessage_returnSadMood(){
        MoodAnalyser analyser=new MoodAnalyser();
        String mood=analyser.analyseMood("This is sad message");
        Assertions.assertEquals("SAD",mood );
    }

    //happy mood testcase
    @Test
    public void givingHappyMessage() {
        MoodAnalyser analyser = new MoodAnalyser();
        String mood = analyser.analyseMood("Iam in HAPPY mood");
        Assertions.assertEquals("HAPPY", mood);
    }

    //giving no parameters
    @Test
    public void givingNoMessage() {
        MoodAnalyser analyser = new MoodAnalyser();
        String mood = analyser.analyseMood("");
        Assertions.assertEquals("HAPPY", mood);
    }

}