package com.persistent.util;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	BeanFactory factory = new XmlBeanFactory( new FileSystemResource("application.xml"));
    	Triangle triangle = (Triangle)factory.getBean("triangle");
    	triangle.draw();
        System.out.println( "Hello World!" + triangle.getArea() );
    }
}
