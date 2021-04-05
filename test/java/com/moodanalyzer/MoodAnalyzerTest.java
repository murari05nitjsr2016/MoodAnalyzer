package com.moodanalyzer;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MoodAnalyzerTest {

    @Test
    public void givenSadMessageShouldReturnsSad()
    {
        MoodAnalyzer moodAnalyzer = new MoodAnalyzer();
        String mood = moodAnalyzer.analyseMood("I am in sad Mood");
        System.out.println(mood);
        Assertions.assertEquals("SAD",mood);
    }


    @Test
    public void givenHappyMessageShouldReturnsHappy()
    {
        MoodAnalyzer moodAnalyzer = new MoodAnalyzer();
        String mood = moodAnalyzer.analyseMood("I am in Happy Mood");
        System.out.println(mood);
        Assertions.assertEquals("HAPPY",mood);
    }

    @Test
    public void givenConstructorSadMessageShouldReturnsSad()
    {
        MoodAnalyzer moodAnalyzer = new MoodAnalyzer("I am in sad Mood");
        String mood = moodAnalyzer.analyseMood();
        System.out.println(mood);
        Assertions.assertEquals("SAD",mood);
    }
    @Test
    public void givenConstructorHappyMessageShouldReturnsHappy()
    {
        MoodAnalyzer moodAnalyzer = new MoodAnalyzer("I am in happy Mood");
        String mood = moodAnalyzer.analyseMood();
        System.out.println(mood);
        Assertions.assertEquals("HAPPY",mood);
    }

}
