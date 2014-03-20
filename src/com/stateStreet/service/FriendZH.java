package com.stateStreet.service;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("myfriend")
@Scope("prototype")
public class FriendZH implements Friend{
	public void makeFriend() {
		System.out.println("交了一个中国的朋友");
	}
	
}
