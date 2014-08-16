package com.persistent;

import org.springframework.context.ApplicationEvent;

public class DrawEvent extends ApplicationEvent{
   private Object source;
	public DrawEvent(Object source) {
		super(source);;
	}
	@Override
	public String toString() {
		return "DrawEvent [source=" + source + "]";
	}
	
}
