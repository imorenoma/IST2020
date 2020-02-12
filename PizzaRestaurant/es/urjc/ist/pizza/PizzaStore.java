package es.urjc.ist.pizza;

/**
 * Class that models a <code>Pizza</code> restaurant. It centralizes the
 * reception and delivery of new orders.
 * 
 * <p> Please, check the <a href="https://github.com/bethrobson/Head-First-Design-Patterns">
 * Head First Design Patterns GitHub repository</a> for additional details.
 * <p>
 * 
 * @author Elisabeth Robson, Felipe Ortega
 *
 */
public class PizzaStore {
	SimplePizzaFactory factory;
 
	public PizzaStore(SimplePizzaFactory factory) { 
		this.factory = factory;
	}
 
	public Pizza orderPizza(String type) {
		Pizza pizza;
 
		pizza = factory.createPizza(type);
 
		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();

		return pizza;
	}

}
