public class Logger {
    private static Logger instance;
    
    private Logger() {
        System.out.println("Logger instance has been created");
    }

    public static Logger getInstance() {

        if (instance == null) {
            instance = new Logger();
        }
        return instance;
    }
   
    public void log(String message) {
        System.out.println("Log Message: " + message);
    }
    public static void main(String[] args) {
       
        Logger logger1 = Logger.getInstance();
        logger1.log("Application has started.");
        
        Logger logger2 = Logger.getInstance();
        logger2.log("User has been logged in.");
        
        if (logger1 == logger2) {
            System.out.println("Singleton verified: Both objects are same instance.");
        } 
        else {
            System.out.println("Singleton failed: Different instances created.");
        }
    }
}
