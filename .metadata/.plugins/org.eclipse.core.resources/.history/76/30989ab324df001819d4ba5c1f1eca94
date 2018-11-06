package staticfactory;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) throws Exception
	{
	    ApplicationContext context = new ClassPathXmlApplicationContext("classpath:/staticfactory/applicationContext.xml");

	    EmployeeDTO manager = (EmployeeDTO) context.getBean("manager");
	    System.out.println(manager);
	     
	    EmployeeDTO director = (EmployeeDTO) context.getBean("director");
	    System.out.println(director);
	}
}
