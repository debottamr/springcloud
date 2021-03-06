package xmlconfig;

import java.util.Properties;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class MainApp {
   public static void main(String[] args) {
      @SuppressWarnings("resource")
      ApplicationContext context = new ClassPathXmlApplicationContext("beans1.xml");
      DatabaseConfig config = context.getBean("configBean", DatabaseConfig.class);

      Properties properties = config.getProperties();
      System.out.println("driverClassName : " + properties.getProperty("driverClassName"));
      System.out.println("url : " + properties.getProperty("url"));
      System.out.println("username : " + properties.getProperty("username"));
      System.out.println("password : " + properties.getProperty("password"));
   }
}
