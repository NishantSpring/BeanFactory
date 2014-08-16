package com.persistent;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ConfigurableApplicationContext ctx = new ClassPathXmlApplicationContext("application.xml");
    	//ctx.start();
    	Triangle triangle = (Triangle)ctx.getBean("triangle");
    	triangle.draw();
        System.out.println( "Hello World!" );
        //ctx.stop();
    }
}
