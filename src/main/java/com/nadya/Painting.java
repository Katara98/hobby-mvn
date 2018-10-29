package com.nadya;

public class Painting extends Hobby{
    private static final String title = "Painting";
    private String style;

    public Painting() {
        super(title);
    }

    public Painting(int hours) {
        super(title, hours);
    }

    public Painting( String style) {
        super(title);
        this.style = style;
    }

    public Painting(int hours, String style) {
        super(title, hours);
        this.style = style;
    }

    public String getStyle() {
        return style;
    }

    public void setStyle(String style) {
        this.style = style;
    }

    public String tellAboutHobby(){
        return title + "{" +
                "hours: " + getHours() +
                ", priority: " + getPriority() +
                ", finished works: " + getFinishedWorks() +
                ", current works: " + getCurrentWorks() +
                ", planned works: " + getPlannedWorks() +
                ", earned money: " + getEarnedMoney() +
                ", spent money: " + getSpentMoney() +
                ", is active: " + isActive() +
                ", style: " + this.style +
                '}';
    }
}
