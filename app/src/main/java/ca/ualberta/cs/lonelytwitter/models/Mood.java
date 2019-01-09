package ca.ualberta.cs.lonelytwitter.models;

public abstract class Mood {

    private String date;

    Mood () {
        this.date = "January 1, 2019";
    }

    Mood(String aDate) {
        this.date = aDate;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
