package Logging;

public class LoggingManager {

    
    private static LoggingManager singleInstance;

 
    private LoggingManager() {
    }

    public static LoggingManager getInstance() {
        if (singleInstance == null) {
            synchronized (LoggingManager.class) {
                if (singleInstance == null) {
                    singleInstance = new LoggingManager();
                }
            }
        }
        return singleInstance;
    }
    public void writeLog(String logMessage) {
        System.out.println("Log Entry: " + logMessage);
    }
    public static void main(String[] args) {
    	
        LoggingManager logger = LoggingManager.getInstance();

        logger.writeLog("First log message.");
        logger.writeLog("Second log message.");
    }
}
