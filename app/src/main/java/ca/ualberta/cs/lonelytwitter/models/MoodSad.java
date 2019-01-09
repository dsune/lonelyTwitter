package ca.ualberta.cs.lonelytwitter.models;

public class MoodSad extends Mood {
    String message = "I am sad :(";

    public String showMood() {
        return message;
    }
}
