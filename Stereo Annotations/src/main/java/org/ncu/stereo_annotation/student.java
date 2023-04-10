package org.ncu.stereo_annotation;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
@Component
public class student {
    @Value("krati Arora")
	private String studentname;
    
	@Value("bhiwadi")
	private String city;
	public String getStudentname() {
		return studentname;
	}
	public void setStudentname(String studentname) {
		this.studentname = studentname;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	@Override
	public String toString() {
		return "student [studentname=" + studentname + ", city=" + city + "]";
	}
	 

}
