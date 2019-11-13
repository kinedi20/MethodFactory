package concrete;


import abstraite.AbstractCreator;
import abstraite.IProduct;


public class CPizza extends AbstractCreator{

	protected IProduct pizza; 
	
	

	
	public CPizza() {
		super();
	}

	public CPizza(IProduct pizza) {
		super();
		this.pizza = pizza;
	}

	public IProduct getPizza() {
		return pizza;
	}

	public void setPizza(IProduct pizza) {
		this.pizza = pizza;
	}

	@Override
	public IProduct factoryMethod() {
		String type = null;
		
		 IProduct factory = null;
		    if (type.equalsIgnoreCase("fr")) {
		      factory = new PizzaAmerican();
		    } 
		    else if (type.equalsIgnoreCase("usa")) {
		      factory = new PizzaSen();
		    } 
		    else if (type.equalsIgnoreCase("sn"))  {
			      factory = new PizzaArabe();
			    }else 
		    return factory;
			return factory;
	}

}
