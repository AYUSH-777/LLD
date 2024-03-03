package org.example;

public abstract class LogProcessor {

    private LogProcessor nextLogProcessor;

    public LogProcessor(LogProcessor nextLogProcessor)
    {
        this.nextLogProcessor = nextLogProcessor;
    }

    public void log(String message,int logLevel)
    {
        if(nextLogProcessor!=null)
        {
            nextLogProcessor.log(message,logLevel);
        }
    }
}
