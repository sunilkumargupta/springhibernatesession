package com.sunRays.services;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.TextMessage;

import org.springframework.stereotype.Service;

@Service
public class ConsumerService  implements MessageListener {
	public ConsumerService() {
		System.out.println("SpringConsumer loaded..");
	}

	public void onMessage(Message message) {
		try {
			System.out.println("Text Message Received:"+ ((TextMessage) message).getText());
		} catch (JMSException e) {
			e.printStackTrace();
		}
	}
}
