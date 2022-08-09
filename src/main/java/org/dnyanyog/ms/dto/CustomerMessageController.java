package org.dnyanyog.ms.dto;

import org.dnyanyog.ms.controller.CustomerAddressMessage;
import org.dnyanyog.ms.kafka.ProduceMeaage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonProcessingException;
@RestController
public class CustomerMessageController {
	
	@Autowired
	ProduceMeaage producer;
	
	@PostMapping(path="/AddCustomer", consumes= {"application/json","application/xml"}, produces= {"application/json","application/xml"})
	public String addCustomer(@RequestBody CustomerAddressMessage customerAddressMessage) throws JsonProcessingException
	{	
		producer.sendMessage(customerAddressMessage.getTopicName(),  customerAddressMessage.getMessage());
		
		return "{\"Success\"}";
	}

}
