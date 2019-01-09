package ca.ualberta.cs.lonelytwitter.models;

public class MoodHappy extends Mood {
    String message = "I am happy :)";

    public String showMood() {
        return message;
    }
}
