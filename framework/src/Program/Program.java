package Program;

import java.util.Locale;
import java.util.Scanner;

import Entities.Order;
import Services.OrderServices;
import Services.ShippingService;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		/*System.out.print("Digite o codigo do produto: ");
		Integer code = sc.nextInt();
		System.out.print("Digite o valor basico do produto: ");
		Double basic = sc.nextDouble();
		System.out.println("Digite o valor de desconto do produto: ");
		Double discount = sc.nextDouble();
		
		Order order = new Order(code, basic, discount);
		ShippingService shippingService = new ShippingService();
		OrderServices orderServices = new OrderServices(shippingService, order);
		*/
	
		
		Order order = new Order(1309, 95.90, 0.0);
		ShippingService shippingService = new ShippingService();
		OrderServices orderServices = new OrderServices(shippingService, order);
	
		System.out.printf("Pedido codigo %d \nValor total: R$ %.2f",order.getCode(), orderServices.CalService());
		
		
	}

}
