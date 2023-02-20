package program;

import java.util.Locale;
import java.util.Scanner;

import entities.Order;
import services.OrderService;
import services.ShippingService;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o codigo do pedido: ");
		Integer code = sc.nextInt();

		System.out.println("Digite o valor basico: ");
		Double basic = sc.nextDouble();

		System.out.println("Digite valor de desconto: ");
		Double discount = sc.nextDouble();

		Order order = new Order(code, basic, discount);
		ShippingService shippingService = new ShippingService();
		OrderService orderService = new OrderService(order, shippingService);

		System.out.println();
		System.out.println("Pedido Codigo " + order.getCode() + "\nValor total: R$ "
				+ String.format("%.2f ", orderService.OrderService(order)));

	}

}
