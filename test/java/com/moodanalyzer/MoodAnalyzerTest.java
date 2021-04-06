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
    public void givenNullMoodShouldThrowMoodAnalysisException()
    {
        MoodAnalyzer moodAnalyzer = new MoodAnalyzer();
        String mood = moodAnalyzer.analyseMood(null);
        System.out.println(mood);
        Assertions.assertEquals("HAPPY",mood);

    }
    @Test
    public void givenEmptyMoodShouldThrowMoodAnalysisException()
    {
        MoodAnalyzer moodAnalyzer = new MoodAnalyzer();
        String mood = moodAnalyzer.analyseMood("");
        System.out.println(mood);
        Assertions.assertEquals("HAPPY",mood);

    }

}
