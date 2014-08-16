package com.persistent;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        ApplicationContext ctx = new ClassPathXmlApplicationContext("application.xml");
        Triangle triangle = (Triangle) ctx.getBean("triangle");
        System.out.println(triangle);
        Point pointC = (Point) ctx.getBean("pointC");
        triangle.setPoint1(pointC);
        System.out.println(triangle);
        triangle.getPoint2();
        triangle.drawString("Nishant Niranjan");
        triangle.drawException("Nishant Niranjan");
    }
}
