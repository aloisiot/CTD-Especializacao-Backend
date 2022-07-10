package com.example.catalogservice.config;

import org.springframework.amqp.core.Queue;
import org.springframework.amqp.rabbit.connection.CachingConnectionFactory;
import org.springframework.amqp.rabbit.core.RabbitAdmin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RabbitMQSenderConfig {

	@Value("${queue.movie.name}")
	private String queueName;

	@Bean
	public RabbitAdmin amqpAdmin(CachingConnectionFactory connectionFactory) {
		return new RabbitAdmin(connectionFactory);
	}

	@Value ("${queue.movie.name}")
	private String movieQueue;

	@Bean
	public Queue queue(RabbitAdmin rabbitAdmin) {
		Queue queue = new Queue(queueName, true);
		rabbitAdmin.declareQueue(queue);
		return queue;
	}
}
