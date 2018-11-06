package spring1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class ApplicationContextEx {

	/*
	ApplicationContext container adds more enterprise-specific functionality such as the ability to resolve textual messages from a properties file and the ability to publish application events to interested event listeners. This container is defined by the org.springframework.context.ApplicationContext interface.

The ApplicationContext container includes all functionality of the BeanFactory container, so it is generally recommended over the BeanFactory. BeanFactory can still be used for lightweight applications like mobile devices or applet based applications where data volume and speed is significant.
	 */
	public static void main(String[] args) {
		
		//ApplicationContext context = new FileSystemXmlApplicationContext("beans.xml");
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		//WebXmlApplicationContext – This container loads the XML file with definitions of all beans from within a web application.

		DepartmentBean obj = (DepartmentBean) context.getBean("demoBean");
		System.out.println(obj);
		
	}
}
