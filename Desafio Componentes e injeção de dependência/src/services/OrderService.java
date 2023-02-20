package services;

import entities.Order;

public class OrderService {

	private Order order;
	private ShippingService shippingService;

	public OrderService() {

	}
	
	public OrderService(Order order, ShippingService shippingService) {
		this.order = order;
		this.shippingService = shippingService;
	}

	public Double OrderService(Order order) {

		if (order.getBasic() >= 200) {
			return shippingService.taxShipping(order.getBasic()) - (order.getBasic() * (order.getDiscount() / 100));
		} else if (order.getBasic() >= 100 && order.getBasic() < 200) {
			return shippingService.taxShipping(order.getBasic()) - (order.getBasic() * (order.getDiscount() / 100));
		} else {
			return shippingService.taxShipping(order.getBasic());
		}

	}

}
