package spring1;

import java.util.Arrays;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;

public class BeanFactorEx {

	public static void main(String[] args) {
		Resource resource = new FileSystemResource("/home/debottamr/springworkspace/spring1/src/main/resources/beans.xml");
		BeanFactory factory = new XmlBeanFactory(resource);
		DepartmentBean obj = (DepartmentBean) factory.getBean("demoBean");
		factory.containsBean("demoBean");
		DepartmentBean bean = factory.getBean("demoBean", DepartmentBean.class);
		Class<?> type = factory.getType("demoBean");
		System.out.println(type);
		boolean singleton = factory.isSingleton("demoBean");
		System.out.println(singleton);
		String[] aliases = factory.getAliases("demoBean");
		System.out.println(Arrays.toString(aliases));
		System.out.println(obj);
	}
}
