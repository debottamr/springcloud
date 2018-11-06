package scheduled;

import org.springframework.scheduling.annotation.Scheduled;

public class ScheduledUsage {

    @Scheduled(fixedDelay = 5000)
    //@Scheduled(fixedRate = 5000)  //Or use this
	public void demoServiceMethod () {
		
	}
	 
	@Scheduled(fixedRate=30000)
	public void demoServiceMethod1 () { 
		
	}
	 
	@Scheduled(cron="0 0 * * * *")
	public void demoServiceMethod2 () { 
		
	}
	/*
	 xmlns:task="http://www.springframework.org/schema/task"
http://www.springframework.org/schema/task
http://www.springframework.org/schema/task/spring-task-3.0.xsd
 
<task:annotation-driven>
	 */
	
}
