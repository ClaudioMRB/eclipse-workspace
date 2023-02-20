package Services;

public class ShippingService{

public ShippingService() {
	
}

		public Double taxShipping(Double amount) {

			if (amount >= 200) {
				return amount;
			} else if (amount >= 100 && amount < 200) {
				return amount + 12;
			} else {
				return amount + 20;
			}

		}

}


