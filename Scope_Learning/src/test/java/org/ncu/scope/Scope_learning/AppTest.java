package org.ncu.scope.Scope_learning;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Unit test for simple App.
 */
class Appdata{
	public static void maoin(String [] args) {
		ApplicationContext con = new ClassPathXmlApplicationContext("org.ncu.scope.Scope_learning.sterepconfig.xml");
		
	}
}


