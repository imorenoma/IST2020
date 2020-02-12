package es.urjc.ist.pizza;

/**
 * This class models a Clam <code>Pizza</code>. It follows the traditional
 * recipe for Italian finest pizza.
 * 
 * <p> Please, check the <a href="https://github.com/bethrobson/Head-First-Design-Patterns">
 * Head First Design Patterns GitHub repository</a> for additional details.
 * <p>
 * 
 * @author Elisabeth Robson, Felipe Ortega
 *
 */
public class ClamPizza extends Pizza {
	
	/**
	 * Default constructor to create a clam <code>Pizza</code>.
	 * 
	 * <p>By default, this <code>Pizza</code> is created with the following ingredients:</p>
	 * 		<ul>
	 * 			<li>Thin crusty dough and white garlic sauce.</li>
	 * 			<li>Toppings: clams and grated parmesan cheese.</li>
	 * 		</ul>
	 */
	public ClamPizza() {
		name = "Clam Pizza";
		dough = "Thin crust";
		sauce = "White garlic sauce";
		toppings.add("Clams");
		toppings.add("Grated parmesan cheese");
	}
}
