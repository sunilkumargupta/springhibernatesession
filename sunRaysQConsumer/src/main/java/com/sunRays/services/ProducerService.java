package com.sunRays.services;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.Session;
import javax.jms.TextMessage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.jms.core.MessageCreator;
import org.springframework.stereotype.Service;

@Service
public class ProducerService {
	@Autowired
	private JmsTemplate template;

	public ProducerService() {
		System.out.println("SpringProducer loaded...");
	}

	public void springSendTextMessage(String text) {
		for (int i = 0; i < 100; i++){
			template.send(new MessageCreator() {
				public Message createMessage(Session session) throws JMSException {
					TextMessage txtMessage = session.createTextMessage();
					long rnd = new java.util.Random().nextLong();
					txtMessage.setText("This is a text message#: " + rnd);
					System.out.println("Sending msg#:" + rnd);
					return txtMessage;
				}
			});
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("All messages sent");

	}
}
