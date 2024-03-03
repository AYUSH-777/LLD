package org.example;

import static org.example.ConstantUtils.DEBUG;
import static org.example.ConstantUtils.ERROR;

public class ErrorLogProcessor extends LogProcessor{
    public ErrorLogProcessor(LogProcessor nextLogProcessor) {
        super(nextLogProcessor);
    }

    @Override
    public void log(String message, int logLevel)
    {
        if(logLevel==ERROR)
        {
            System.out.println(message+" : "+logLevel);
        }
        else
        {
            System.out.println("Hopping from Error");
            super.log(message,logLevel);
        }
    }
}
