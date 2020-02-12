package es.urjc.ist.pizza;

/**
 * This class models a Veggie <code>Pizza</code>. It ensures that all ingredients
 * are compliant with a vegetarian diet.
 * 
 * <p> Please, check the <a href="https://github.com/bethrobson/Head-First-Design-Patterns">
 * Head First Design Patterns GitHub repository</a> for additional details.
 * <p>
 * 
 * @author Elisabeth Robson, Felipe Ortega
 *
 */
public class VeggiePizza extends Pizza {
	
	/**
	 * Default constructor to create a vegetarian <code>Pizza</code>.
	 * 
	 * <p>By default, this <code>Pizza</code> is created with the following ingredients:</p>
	 * 		<ul>
	 * 			<li>Crusty dough and marinara sauce.</li>
	 * 			<li>Toppings: shredded mozzarella; grated parmesian,
	 * 			diced onion, sliced mushrooms, red pepper and black olives.</li>
	 * 		</ul>
	 */
	public VeggiePizza() {
		name = "Veggie Pizza";
		dough = "Crust";
		sauce = "Marinara sauce";
		toppings.add("Shredded mozzarella");
		toppings.add("Grated parmesan");
		toppings.add("Diced onion");
		toppings.add("Sliced mushrooms");
		toppings.add("Sliced red pepper");
		toppings.add("Sliced black olives");
	}
}
