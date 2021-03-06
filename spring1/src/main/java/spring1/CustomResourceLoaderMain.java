package spring1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CustomResourceLoaderMain {

	@SuppressWarnings("resource")
	public static void main(String[] args) throws Exception
	{
	    ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
	 
	    CustomResourceLoader customResourceLoader = (CustomResourceLoader) context.getBean("customResourceLoader");
	 
	    customResourceLoader.showResourceData();
	    
	    CustomResourceLoaderIn customResourceLoaderIn = (CustomResourceLoaderIn) context.getBean("CustomResourceLoaderIn");
	    customResourceLoaderIn.showResourceData();
	    
	}
}
