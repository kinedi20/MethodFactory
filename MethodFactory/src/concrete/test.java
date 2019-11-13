package concrete;

import abstraite.IProduct;

public class test {

	public static void main(String[] args) {
		CPizza createur= new CPizza();
		IProduct produit= createur.getPizza();
		produit.service();
	}

}
