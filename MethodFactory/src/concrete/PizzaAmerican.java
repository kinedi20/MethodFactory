package concrete;

import abstraite.IProduct;

public class PizzaAmerican implements IProduct {
	
	
	@Override
	public void service() {
		System.out.println("pizza a l'americaine");
	}

}
