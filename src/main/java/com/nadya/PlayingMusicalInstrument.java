package com.nadya;

public class PlayingMusicalInstrument extends Hobby {
    private static final String title = "Playing musical instrument";
    private String instrument;

    public PlayingMusicalInstrument() {
        super(title);
    }

    public PlayingMusicalInstrument(int hours) {
        super(title, hours);
    }

    public PlayingMusicalInstrument(String instrument) {
        super(title);
        this.instrument = instrument;
    }

    public PlayingMusicalInstrument(int hours, String instrument) {
        super(title, hours);
        this.instrument = instrument;
    }

    public String getInstrument() {
        return instrument;
    }

    public void setInstrument(String instrument) {
        this.instrument = instrument;
    }

    public String tellAboutHobby() {
        return title + "(" + this.instrument + ") {"
                + "hours: " + getHours()
                + ", priority: " + getPriority()
                + ", finished songs: " + getFinishedWorks()
                + ", current songs: " + getCurrentWorks()
                + ", planned songs: " + getPlannedWorks()
                + ", earned money: " + getEarnedMoney()
                + ", spentmoney: " + getSpentMoney()
                + ", is active: " + isActive()
                + '}';
    }
}
