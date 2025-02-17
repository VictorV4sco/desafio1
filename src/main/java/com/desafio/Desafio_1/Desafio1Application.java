package com.desafio.Desafio_1;

import java.text.DecimalFormat;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.desafio.Desafio_1.entities.Order;
import com.desafio.Desafio_1.services.OrderService;

@SpringBootApplication
public class Desafio1Application implements CommandLineRunner {
	
	@Autowired
	private OrderService orderService;
	
	public static void main(String[] args) {
		SpringApplication.run(Desafio1Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
	
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Código:");
		int code = sc.nextInt();
		
		System.out.print("Valor:");
		double basic = sc.nextDouble();
		
		System.out.print("Desconto:");
		double discount = sc.nextDouble();
		
		Order order = new Order(code, basic, discount);
		
		DecimalFormat df = new DecimalFormat("#,###.00");
		
		System.out.println("Pedido código " + order.getCode());
		System.out.println("Valor total: R$ " + df.format(orderService.Total(order)));
		
		
		sc.close();
	}

}
