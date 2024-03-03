package org.example;

public class WeightMachineInKgs implements WeightMachineAdapter{

    private WeightMachine weightMachine;

    public WeightMachineInKgs()
    {
        weightMachine = new WightMachineInPounds();
    }

    @Override
    public double getWightInKgs() {
        return weightMachine.getWeightInPounds()*0.4;
    }
}
