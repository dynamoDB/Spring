package com.stateStreet.service;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;


@Component
@Scope("prototype")
public class FriendJP implements Friend{

	public void makeFriend() {
		System.out.println("交了个日本朋友");
	}
	
}
