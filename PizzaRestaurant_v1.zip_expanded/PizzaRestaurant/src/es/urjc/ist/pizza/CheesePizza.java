package es.urjc.ist.pizza;

/**
 * This class models a Cheese <code>Pizza</code>. It follows the traditional
 * recipe for Italian finest pizza.
 * 
 * <p> Please, check the <a href="https://github.com/bethrobson/Head-First-Design-Patterns">
 * Head First Design Patterns GitHub repository</a> for additional details.
 * <p>
 * 
 * @author Elisabeth Robson, Felipe Ortega
 *
 */
public class CheesePizza extends Pizza {
	
	/**
	 * Default constructor to create a cheese <code>Pizza</code>.
	 * 
	 * <p>By default, this <code>Pizza</code> is created with the following ingredients:</p>
	 * 		<ul>
	 * 			<li>Regular crusty dough and marinara sauce.</li>
	 * 			<li>Toppings: fresh mozzarella and parmesan cheese.</li>
	 * 		</ul>
	 */
	public CheesePizza() {
		name = "Cheese Pizza";
		dough = "Regular Crust";
		sauce = "Marinara Pizza Sauce";
		toppings.add("Fresh Mozzarella");
		toppings.add("Parmesan");
	}
}
