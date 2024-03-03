package org.example;

import static org.example.ConstantUtils.INFO;

public class InfoLogProcessor extends LogProcessor{
    public InfoLogProcessor(LogProcessor nextLogProcessor) {
        super(nextLogProcessor);
    }

    @Override
    public void log(String message, int logLevel)
    {
        if(logLevel==INFO)
        {
            System.out.println(message+" : "+logLevel);
        }
        else
        {
            System.out.println("Hopping from Info");
            super.log(message,logLevel);
        }
    }
}
