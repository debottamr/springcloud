package scanconfig;

import java.util.Properties;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainApp {
   public static void main(String[] args) {
      AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
      DatabaseConfig config = context.getBean(DatabaseConfig.class);
      Properties properties = config.getProperties();
      System.out.println("driverClassName : " + properties.getProperty("driverClassName"));
      System.out.println("url : " + properties.getProperty("url"));
      System.out.println("username : " + properties.getProperty("username"));
      System.out.println("password : " + properties.getProperty("password"));
      
      context.close();
   }
}