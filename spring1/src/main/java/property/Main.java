package property;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("classpath:/property/applicationContext.xml");
		
		 
		DemoServicePropertiesExample bean = (DemoServicePropertiesExample)context.getBean("demoServicePropertiesExample");
		
		
	}
}
