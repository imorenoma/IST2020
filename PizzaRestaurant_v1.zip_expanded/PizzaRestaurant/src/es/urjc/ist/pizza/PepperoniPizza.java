package es.urjc.ist.pizza;

/**
 * This class models a Pepperoni <code>Pizza</code>. It follows the traditional
 * recipe for Italian finest pizza.
 * 
 * <p> Please, check the <a href="https://github.com/bethrobson/Head-First-Design-Patterns">
 * Head First Design Patterns GitHub repository</a> for additional details.
 * <p>
 * 
 * @author Elisabeth Robson, Felipe Ortega
 *
 */
public class PepperoniPizza extends Pizza {
	
	/**
	 * Default constructor to create a pepperoni <code>Pizza</code>.
	 * 
	 * <p>By default, this <code>Pizza</code> is created with the following ingredients:</p>
	 * 		<ul>
	 * 			<li>Crusty dough and marinara sauce.</li>
	 * 			<li>Toppings: sliced pepperoni, onion and grated
	 * 			parmesan cheese.</li>
	 * 		</ul>
	 */
	public PepperoniPizza() {
		name = "Pepperoni Pizza";
		dough = "Crust";
		sauce = "Marinara sauce";
		toppings.add("Sliced Pepperoni");
		toppings.add("Sliced Onion");
		toppings.add("Grated parmesan cheese");
	}
}
