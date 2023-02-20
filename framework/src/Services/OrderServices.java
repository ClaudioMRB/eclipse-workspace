package Services;

import Entities.Order;

public class OrderServices {
	Double valor = 0.0;

	private ShippingService shippingService;
	private Order order;
	
	public OrderServices() {
		
	}
	
	
	public OrderServices(ShippingService shippingService, Order order) {
		this.shippingService = shippingService;
		this.order = order;
	}

	public double CalService() {
		
		if(order.getBasic() >= 200) {
		   return  this.valor = shippingService.taxShipping(order.getBasic()) - (order.getBasic() * (order.getDiscount() / 100));
		}else if (order.getBasic() >= 100 && order.getBasic() < 200){
			return shippingService.taxShipping(order.getBasic()) - (order.getBasic() * (order.getDiscount() / 100));
		}else {
			return shippingService.taxShipping(order.getBasic());
		}
		
		

		
	}


	public Double getValor() {
		return valor;
	}
	
	

}
