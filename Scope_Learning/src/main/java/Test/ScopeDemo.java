package Test;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Scope;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

public class ScopeDemo {
	public static void main(String args []) {
		ApplicationContext con = new ClassPathXmlApplicationContext("stereoconfig.xml");
		Emp emp = 
		
	}
}

@Component("ob")
@Scope("prototype")

class Emp{
	@Value("krati")
	String empName;
	@Value("gurgaon")
	String empCity;
	
	@Value("#{temp}")
	
	Emp(){
		System.out.println("Constructor called...");
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getEmpCity() {
		return empCity;
	}
	public void setEmpCity(String empCity) {
		this.empCity = empCity;
	}
	@Override
	public String toString() {
		return "emp [empName=" + empName + ", empCity=" + empCity + "]";
	}
	
}

