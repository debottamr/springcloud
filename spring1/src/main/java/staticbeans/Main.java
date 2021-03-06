package staticbeans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("classpath:/staticbeans/applicationContext.xml");
		 
		EmployeeTypeWrapper employeeTypeWrapper = (EmployeeTypeWrapper) context.getBean("employeeTypeWrapper");
		 
		System.out.println(employeeTypeWrapper.getManager());
		System.out.println(employeeTypeWrapper.getDirector());
	}
}
