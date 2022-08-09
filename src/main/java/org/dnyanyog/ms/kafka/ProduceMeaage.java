package org.dnyanyog.ms.kafka;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

@Component
public class ProduceMeaage {
	
	@Autowired
	private KafkaTemplate<String, String> kafkaTemplate;

	public void sendMessage(String topicName, String msg) {
		
		System.out.println("############ Sending kafka message to topic - "+topicName+" Message - "+msg);
	    kafkaTemplate.send(topicName, msg);
	}

}
