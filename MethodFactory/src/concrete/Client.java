package concrete;

import abstraite.IProduct;

public class Client {

	public void Operation() {
		
		CPizza createur= new CPizza();
		IProduct produit= createur.factoryMethod();
		produit.service();
		
	}
   public void main() {
	   Operation();
   }
}
