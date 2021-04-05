package com.moodanalyzer;

public class MoodAnalyzer {

    private String message;

public MoodAnalyzer(String message){
    this.message = message;

}
public MoodAnalyzer()
{

}
    public String analyseMood(String message) {
        this.message = message;
        return analyseMood();
    }
    // Handeling NullPointerException
    public String analyseMood()
    {
        try{
            if(message.contains("sad"))
                return "SAD";
            else
                return "HAPPY";
        } catch (NullPointerException e){
            return "HAPPY";
        }
    }
}
