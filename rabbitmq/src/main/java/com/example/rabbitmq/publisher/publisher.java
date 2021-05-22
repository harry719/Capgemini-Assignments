package com.example.rabbitmq.publisher;

import java.util.UUID;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.rabbitmq.config.MessagingConfig;
import com.example.rabbitmq.dto.Order;
import com.example.rabbitmq.dto.OrderStatus;

import org.springframework.web.bind.annotation.*;



@RestController
@RequestMapping("/order")
public class publisher {
    
	@Autowired
	private RabbitTemplate Template;
	
	@PostMapping("/{restaurantName}")
	public String bookOrder(@RequestBody Order order,@PathVariable String restaurantName) {
		order.setOrderId(UUID.randomUUID().toString());
		
		//restaurantservises
		//payment
		OrderStatus orderStatus=new OrderStatus(order,"PROCESS","order placed successfully in");
		Template.convertAndSend(MessagingConfig.exchange,MessagingConfig.routingkey,orderStatus);
		return "sucess!!";
	}
	

}