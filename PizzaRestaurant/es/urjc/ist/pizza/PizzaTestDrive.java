package es.urjc.ist.pizza;

/**
 * This is a testing class to check the behavior of the
 * different classes for our <code>Pizza</code> restaurant.
 * 
 * <p> Please, check the <a href="https://github.com/bethrobson/Head-First-Design-Patterns">
 * Head First Design Patterns GitHub repository</a> for additional details.
 * <p>
 * 
 * @author Elisabeth Robson, Felipe Ortega
 *
 */
public class PizzaTestDrive {
 
	/**
	 * The main class to test the pizza ordering pipeline.
	 * 
	 * It orders the four possible types of <code>Pizza</code> objects currently available:
	 * Cheese, Clam, Pepperoni and Veggie.
	 * 
	 * @param args Generic arguments for <code>main</code> method.
	 */
	public static void main(String[] args) {
		// Create new pizza factory to initialize our pizza store
		SimplePizzaFactory factory = new SimplePizzaFactory();
		PizzaStore store = new PizzaStore(factory);

		// Test new Cheese pizza
		Pizza pizza = store.orderPizza("cheese");
		System.out.println("We ordered a " + pizza.getName() + "\n");
		System.out.println(pizza);
		
		// Test new Clam pizza
		pizza = store.orderPizza("clam");
		System.out.println("We ordered a " + pizza.getName() + "\n");
		System.out.println(pizza);
		
		// Test new Pepperoni pizza
		pizza = store.orderPizza("pepperoni");
		System.out.println("We ordered a " + pizza.getName() + "\n");
		System.out.println(pizza);
 
		// Test new Veggie pizza
		pizza = store.orderPizza("veggie");
		System.out.println("We ordered a " + pizza.getName() + "\n");
		System.out.println(pizza);
	}
}
