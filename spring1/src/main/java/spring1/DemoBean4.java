package spring1;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
 
public class DemoBean4
{
    @PostConstruct
    public void customInit()
    {
        System.out.println("Method customInit() invoked...");
    }
     
    @PreDestroy
    public void customDestroy()
    {
        System.out.println("Method customDestroy() invoked...");
    }
}