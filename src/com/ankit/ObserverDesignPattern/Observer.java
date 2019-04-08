package com.ankit.ObserverDesignPattern;

/*Observer pattern is used when there is one to many relationship between objects such as if one object modified
all its dependent object are to be notified automatically.It comes under behavioural design pattern*/

public interface Observer {
	
	public void update(float interest);

}
