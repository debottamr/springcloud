package scanconfig;

import java.util.Properties;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author imssbora
 */
@Configuration
@ComponentScan(basePackages = "scanconfig")
public class AppConfig {

	@Bean
	@Qualifier("databaseConfigProps")
	public Properties getDatabaseConfig() {
		Properties props = new Properties();
		props.setProperty("driverClassName", "com.mysql.jdbc.Driver");
		props.setProperty("url", "jdbc:mysql://localhost:3306/mydb");
		props.setProperty("username", "root");
		props.setProperty("password", "abcdxyz");
		return props;
	}
}