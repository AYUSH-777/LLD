package org.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Scheduler {
    private static Scheduler instance=null;

    private Map<String, List<Schedule>> trainSchedule = new HashMap<>();
    private Map<String,List<Schedule>> platformSchedule = new HashMap<>();

    private Scheduler(){}

    public static synchronized Scheduler getInstance()
    {
        if (instance==null)
        {
            instance = new Scheduler();
        }
        return instance;
    }

    public boolean assign(Schedule schedule)
    {
        List<Schedule> trainScheduleList = new ArrayList<>();
        List<Schedule> platformScheduleList = new ArrayList<>();

        if(trainSchedule.containsKey(schedule.trainId))
        {
            trainScheduleList = trainSchedule.get(schedule.trainId);
        }
        if(platformSchedule.containsKey(schedule.platformId))
        {
            platformScheduleList = platformSchedule.get(schedule.platformId);
        }
        for(Schedule currentSchedule:trainScheduleList)
        {
            if(currentSchedule.isOverlapping(schedule.startTime,schedule.endTime))
            {
                return false;
            }
        }
        for(Schedule currrentSchedule:platformScheduleList)
        {
            if(currrentSchedule.isOverlapping(schedule.startTime,schedule.endTime))
            {
                return false;
            }
        }
        trainScheduleList.add(schedule);
        trainSchedule.put(schedule.trainId,trainScheduleList);
        platformScheduleList.add(schedule);
        platformSchedule.put(schedule.platformId,platformScheduleList);
        return true;
    }

    public String getTrainAtPlatform(String platformId, long time)
    {
        if(!platformSchedule.containsKey(platformId))
        {
            return null;
        }
        List<Schedule> platformScheduleList = platformSchedule.get(platformId);
        for(Schedule currentPlatform:platformScheduleList)
        {
            if(currentPlatform.contains(time))
            {
                return currentPlatform.trainId;
            }
        }
        return null;
    }

    public String getPlatformForTrain(String trainId, long time)
    {
        if(!trainSchedule.containsKey(trainId))
        {
            return null;
        }
        List<Schedule> trainScheduleList = trainSchedule.get(trainId);
        for(Schedule currentTrainSchedule:trainScheduleList)
        {
            if(currentTrainSchedule.contains(time))
            {
                return currentTrainSchedule.platformId;
            }
        }
        return null;
    }
}
