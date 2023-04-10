import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test{
	public static void maoin(String [] args) {
		ApplicationContext con = new ClassPathXmlApplicationContext("org.ncu.scope.Scope_learning.sterepconfig.xml");
		 
	}
}