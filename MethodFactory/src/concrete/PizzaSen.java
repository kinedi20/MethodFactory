package concrete;

import abstraite.IProduct;

public class PizzaSen implements IProduct {

	@Override
	public void service() {
		System.out.println("pizza a la senegalaise");

	}

}
