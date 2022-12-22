package org.example;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ProgramLogger.getProgramLogger().addLogInfo("Something happening");
        ProgramLogger.getProgramLogger().addLogInfo("Something happening again");
        ProgramLogger.getProgramLogger().showLog();
    }
}
