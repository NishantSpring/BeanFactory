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
        System.out.println("triangle1::"+triangle);
        triangle.setArea(1000);
        System.out.println("triangle2::"+triangle);
        Triangle triangle1=(Triangle)factory.getBean("triangle");
        //System.out.println( "Hello World::" + triangle.getArea() );
        System.out.println("triangle3::"+triangle1);
        Rectangle rectangle =(Rectangle) factory.getBean("rectangle");
        System.out.println("Rectangle::"+rectangle);
        rectangle =(Rectangle) factory.getBean("rectangle1");
        System.out.println("Rectangle1::"+rectangle);
        Line line =(Line)factory.getBean("line");
        System.out.println("Lines::"+line);
        Square square =(Square)factory.getBean("square");
        System.out.println("Square::"+square);
    }
}
