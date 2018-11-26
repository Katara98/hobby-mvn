package com.nadya;

public abstract class Hobby {
    private String name;
    private char priority = 'A';
    private byte currentWorks;
    private short plannedWorks;
    private int hours;
    private long finishedWorks;
    private float earnedMoney;
    private double spentMoney;
    private boolean isActive;

    Hobby(String name) {
        this.name = name;
    }

    Hobby(String name, int hours) {
        this.name = name;
        this.hours = hours;
    }

    public char getPriority() {
        return priority;
    }

    public void setPriority(char priority) {
        this.priority = priority;
    }

    public byte getCurrentWorks() {
        return currentWorks;
    }

    public void setCurrentWorks(byte currentWorks) {
        this.currentWorks = currentWorks;
    }

    public short getPlannedWorks() {
        return plannedWorks;
    }

    public void setPlannedWorks(short plannedWorks) {
        this.plannedWorks = plannedWorks;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) throws HobbyException {
        if (hours < 0) {
            throw new HobbyException("Time can't be less than 0");
        }
        this.hours = hours;
    }

    public long getFinishedWorks() {
        return finishedWorks;
    }

    public void setFinishedWorks(long finishedWorks) {
        this.finishedWorks = finishedWorks;
    }

    public float getEarnedMoney() {
        return earnedMoney;
    }

    public void setEarnedMoney(float earnedMoney) {
        this.earnedMoney = earnedMoney;
    }

    public double getSpentMoney() {
        return spentMoney;
    }

    public void setSpentMoney(double spentMoney) {
        this.spentMoney = spentMoney;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract String tellAboutHobby();

    public double getProfit() {
        return earnedMoney - spentMoney;
    }
}
