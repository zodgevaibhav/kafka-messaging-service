package org.dnyanyog.ms.kafka;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class ConsumeMessage {
	
	@KafkaListener(topics = "customer-address", groupId = "customer")
	public void listenGroupFoo(String message) {
	    System.out.println("############ Received Message in group foo: " + message);
	}

}
