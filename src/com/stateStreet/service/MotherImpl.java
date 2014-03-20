package com.stateStreet.service;

import javax.annotation.Resource;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;


@Component("mymother")
@Scope("prototype")
public class MotherImpl implements Mother {
	@Resource(name="myfriend")
	public Friend  friend;
	//�����Զ����ã���ָ����bean�������
	public void setFriend(Friend friend) {
		this.friend = friend;
	}

	public void execute() {
		friend.makeFriend();
	}
}
