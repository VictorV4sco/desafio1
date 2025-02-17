package com.desafio.Desafio_1.services;

import org.springframework.stereotype.Service;

import com.desafio.Desafio_1.entities.Order;

@Service
public class ShippingService {

//	public Double Shipment(Order order) {
//		if(order.getBasic() < 100) {
//			order.setBasic(order.getBasic() - order.getBasic() + 20);
//		} else if(order.getBasic() >= 100 && order.getBasic() <= 200) {
//			order.setBasic(order.getBasic() - order.getBasic() + 12);
//		} else {
//			order.setBasic(order.getBasic() - order.getBasic() + 0);
//		}
//		return order.getBasic();
//	}
	
	public Double Shipment(Order order) {
		if(order.getBasic() < 100) {
			return 20.0;
		} else if(order.getBasic() >= 100 && order.getBasic() <= 200) {
			return 12.0;
		} else {
			return 0.0;
		}
	}
}