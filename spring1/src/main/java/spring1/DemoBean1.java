package spring1;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
 
public class DemoBean1 implements InitializingBean, DisposableBean
{
    //Other bean attributes and methods
     
    @Override
    public void afterPropertiesSet() throws Exception
    {
        //Bean initialization code
    }
     
    @Override
    public void destroy() throws Exception
    {
        //Bean destruction code
    }
}