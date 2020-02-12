package es.urjc.ist.pizza;

/**
 * This class creates a simple factory of {@link es.urjc.ist.pizza.Pizza} objects
 * It knows the details about what constructor we must call
 * depending on the type of <code>Pizza</code> that we choose.
 * 
 * <p> Please, check the <a href="https://github.com/bethrobson/Head-First-Design-Patterns">
 * Head First Design Patterns GitHub repository</a> for additional details.
 * <p>
 * 
 * @author Elisabeth Robson, Felipe Ortega
 */
public class SimplePizzaFactory {

	/**
	 * Simple <em>factory</em> method to create pizza objects. We
	 * can specify the type of pizza to be created using a
	 * single input parameter.
	 * 
	 * @param type The type of pizza to create. Currently supported
	 * 			   types are: "cheese", "pepperoni", "clam", "veggie".
	 * @return A new {@link es.urjc.ist.pizza.Pizza} object.
	 */
	public Pizza createPizza(String type) {
		Pizza pizza = null;

		// Call the specific constructor depending on the type of pizza
		if (type.equals("cheese")) {
			pizza = new CheesePizza();
		} else if (type.equals("pepperoni")) {
			pizza = new PepperoniPizza();
		} else if (type.equals("clam")) {
			pizza = new ClamPizza();
		} else if (type.equals("veggie")) {
			pizza = new VeggiePizza();
		}
		return pizza;
	}
}
