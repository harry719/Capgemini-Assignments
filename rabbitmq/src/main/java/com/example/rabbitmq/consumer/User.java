package com.example.rabbitmq.consumer;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

import com.example.rabbitmq.config.MessagingConfig;
import com.example.rabbitmq.dto.OrderStatus;

@Component
public class User {
	
	
	@RabbitListener(queues= MessagingConfig.queue)
	public void consumeMessaegeFromQueue(OrderStatus orderStatus) {
		System.out.println("message receieved from queue :"+orderStatus);
	}
	
	

}
