package org.example;

public class Main {
    public static void main(String[] args) {
        Scheduler scheduler = Scheduler.getInstance();
        boolean assign1 = scheduler.assign(new Schedule("T1", "P1", 1, 3));
        System.out.println("assign1 : "+assign1);
        boolean assign2 = scheduler.assign(new Schedule("T2", "P2", 1, 3));
        System.out.println("assign2 : "+assign2);
        boolean assign3 = scheduler.assign(new Schedule("T3", "P1", 2, 4));
        System.out.println("assign3 : "+assign3);

        String trainId = scheduler.getTrainAtPlatform("P1",2);
        System.out.println("trainId : "+trainId);
        String platformId = scheduler.getPlatformForTrain("T2", 2);
        System.out.println("platformId : "+ platformId);
    }
}