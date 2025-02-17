package com.desafio.Desafio_1.services;

import org.springframework.stereotype.Service;

import com.desafio.Desafio_1.entities.Order;

@Service
public class OrderService {
	
	private ShippingService shippingService;

	public OrderService(ShippingService shippingService) {
		this.shippingService = shippingService;
	}

	public Double Total(Order order) {
		return order.getBasic() * ((100-order.getDiscount())/100) + shippingService.Shipment(order) ;
	}
}
