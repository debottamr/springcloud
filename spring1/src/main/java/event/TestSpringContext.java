package event;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpringContext
{
    @SuppressWarnings("resource")
    public static void main(String[] args) throws Exception
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:/event/applicationContext.xml");
 
        EmployeeController controller = context.getBean(EmployeeController.class);
         
        controller.createNewEmployee();
    }
}