package bookmyshow;

import java.sql.*;

import java.util.Date;

public class Mall {

    private int totalSeatCapacity;
    private Date currentDate;
    private int numOfShows;
    private int runningTimeinMins;
    private Timestamp startTime;
    private Timestamp endTime;

    public void setTotalSeatCapacity(int totalSeatCapacity) {
        this.totalSeatCapacity = totalSeatCapacity;
    }

    public int getTotalSeatCapacity() {
        return totalSeatCapacity;
    }

    public void setCurrentDate(Date currentDate) {
        this.currentDate = currentDate;
    }

    public Date getCurrentDate() {
        return currentDate;
    }

    public void setStartTime(Timestamp startTime) {
        this.startTime = startTime;
    }

    public Timestamp getStartTime() {
        return startTime;
    }

    public void setEndTime(Timestamp endTime) {
        this.endTime = endTime;
    }

    public Timestamp getEndTime() {
        return endTime;
    }


    public void setRunningTimeinMins(int runningTimeinMins) {
        this.runningTimeinMins = runningTimeinMins;
    }

    public int getRunningTimeinMins() {
        return runningTimeinMins;
    }


    public void setNumOfShows(int numOfShows) {
        this.numOfShows = numOfShows;
    }

    public int getNumOfShows() {
        return numOfShows;
    }
}
