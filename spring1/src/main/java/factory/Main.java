package factory;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) throws Exception {
		 
		ApplicationContext context = new ClassPathXmlApplicationContext("classpath:/factory/applicationContext.xml");
		 
        EmployeeDTO manager = (EmployeeDTO) context.getBean("manager");
        System.out.println(manager);
         
        EmployeeDTO director = (EmployeeDTO) context.getBean("director");
        System.out.println(director);
        
        
        EmployeeFactoryBean factory = (EmployeeFactoryBean) context.getBean("&director");
        System.out.println(factory.getDesignation());
        System.out.println(factory.getObjectType());
        System.out.println(factory.getObject());
         
	}
}
