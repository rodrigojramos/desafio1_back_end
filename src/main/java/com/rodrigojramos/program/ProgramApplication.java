package com.rodrigojramos.program;

import com.rodrigojramos.entities.Order;
import com.rodrigojramos.services.OrderService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"com.rodrigojramos"})
public class ProgramApplication implements CommandLineRunner {

	private OrderService orderService;

	public ProgramApplication(OrderService orderService) {
		this.orderService = orderService;
	}

	public static void main(String[] args) {

		SpringApplication.run(ProgramApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Order order = new Order(1034, 150.00, 20.0);
		System.out.println("Pedido código " + order.getCode());
		System.out.println("Valor total: R$ " + orderService.total(order));
	}
}
