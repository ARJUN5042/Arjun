import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import com.configuration.WebConfig;
import com.service.UserService;

public class Application 
{
	public static void main(String[] args) 
	{
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(WebConfig.class);
		
		UserService userService=context.getBean(UserService.class);
		
		((AbstractApplicationContext) userService).start();
		
		context.close();
	}
}
