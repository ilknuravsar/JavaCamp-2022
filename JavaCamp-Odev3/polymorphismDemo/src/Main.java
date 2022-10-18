public class Main {
    public static void main(String[] args) {

        //BaseLogger[] loggers = new BaseLogger[]{new DatabaseLogger(), new FileLogger()};
        //for(BaseLogger logger:loggers){
        //    logger.Log("LogMessage1710");
       // }

        CustomerManager customerManager = new CustomerManager(new DatabaseLogger());
        customerManager.add();

    }
}