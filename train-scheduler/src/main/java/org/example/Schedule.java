package org.example;

public class Schedule {
    String trainId;
    String platformId;
    int startTime;
    int endTime;

    public Schedule(String trainId, String platformId, int startTime, int endTime) {
        this.trainId = trainId;
        this.platformId = platformId;
        this.startTime = startTime;
        this.endTime = endTime;
    }

    public boolean isOverlapping(long start, long end)
    {
        return startTime<=end && start<=endTime;
    }

    public boolean contains(long time)
    {
        return startTime<=time && time<=endTime;
    }
}
