package com.persistent;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;

public class DrawEventListener implements ApplicationListener<DrawEvent> {

	public void onApplicationEvent(DrawEvent arg0) {
		 System.out.println("event thrown::"+arg0);
		
	}
 
}
