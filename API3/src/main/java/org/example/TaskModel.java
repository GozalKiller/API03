package org.example;

public class TaskModel { //גייסון הפנימי
    private String title;
    private String date;
    private boolean done;

    //JASON FORMAT:

    /*
    "tasks": [
    {
    "title": "add botton",
    "date": "2024-06-26 19:32:24",
    "done": true
     */

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public boolean isDone() {
        return done;
    }

    public void setDone(boolean done) {
        this.done = done;
    }
}
