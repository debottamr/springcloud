package spring1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAutowireByConstructor {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				new String[] { "applicationContextAutoWireByConstructor.xml" });

		EmployeeBean employee = (EmployeeBean) context.getBean("employee");

		System.out.println(employee.getFullName());

		System.out.println(employee.getDepartmentBean().getName());
	}
}