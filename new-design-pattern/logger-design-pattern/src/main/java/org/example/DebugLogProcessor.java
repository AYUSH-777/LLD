package org.example;

import static org.example.ConstantUtils.DEBUG;
import static org.example.ConstantUtils.INFO;

public class DebugLogProcessor extends LogProcessor{

    public DebugLogProcessor(LogProcessor nextLogProcessor) {
        super(nextLogProcessor);
    }

    @Override
    public void log(String message, int logLevel)
    {
        if(logLevel==DEBUG)
        {
            System.out.println(message+" : "+logLevel);
        }
        else
        {
            System.out.println("Hopping from Debug");
            super.log(message,logLevel);
        }
    }

}
