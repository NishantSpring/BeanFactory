package com.persistent;

import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;

public class Triangle implements ApplicationEventPublisherAware{
	private ApplicationEventPublisher publisher;
	public void draw()
	{
		System.out.println("triangle is drawn");
		DrawEvent event = new DrawEvent(this);
		publisher.publishEvent(event);
	}

	@Override
	public String toString() {
		return "Triangle [publisher=" + publisher + "]";
	}

	public void setApplicationEventPublisher(ApplicationEventPublisher publisher) {
		this.publisher = publisher;
		
	}

}
