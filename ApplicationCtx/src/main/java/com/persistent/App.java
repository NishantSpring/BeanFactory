package com.persistent;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.persistent.Triangle;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext factory = new ClassPathXmlApplicationContext( "application.xml");
    	Triangle triangle = (Triangle)factory.getBean("triangle");
    	triangle.draw();
        System.out.println( "Hello World!" + triangle.getArea() );
        System.out.println("triangle::"+triangle);
    }
}
