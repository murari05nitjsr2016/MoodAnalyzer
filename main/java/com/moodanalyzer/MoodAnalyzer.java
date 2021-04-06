package com.moodanalyzer;

public class MoodAnalyzer {

    private String message;

    public MoodAnalyzer(String message) {
        this.message = message;

    }

    public MoodAnalyzer() {

    }


    // Handeling NullPointerException
    public String analyseMood(String message) {
        try {
            this.message = message;
            if (message == null || message.isEmpty())
            {
                throw new MoodAnalysisException();
            }

        } catch (MoodAnalysisException e) {
            return "HAPPY";

        }

        return null;
    }
}
