package com.dub.spring.listeners;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;
import org.springframework.web.socket.messaging.SessionDisconnectEvent;

import com.dub.spring.stomp.StompClient;


@Component
public class StompDisconnectEventListener implements ApplicationListener<SessionDisconnectEvent> {

	@Autowired
	private StompClient stompClient;
	
	@Override
	public void onApplicationEvent(SessionDisconnectEvent event) {
		
		stompClient.disconnect();
	}
}
