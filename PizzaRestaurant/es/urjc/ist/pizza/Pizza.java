package es.urjc.ist.pizza;

import java.util.ArrayList;

/**
 * Abstract class defining a generic <code>Pizza</code> object. It defines
 * all default members (fields and methods) that any <code>Pizza</code> object
 * should exhibit in our restaurant.
 * 
 * <p> Please, check the <a href="https://github.com/bethrobson/Head-First-Design-Patterns">
 * Head First Design Patterns GitHub repository</a> for additional details.
 * <p>
 * 
 * @author Elisabeth Robson, Felipe Ortega
 *
 */
abstract public class Pizza {
	/**
	 * Name of this <code>Pizza</code>.
	 */
	String name;
	/**
	 * Dough type of this <code>Pizza</code>.
	 */
	String dough;
	/**
	 * Sauce type of this <code>Pizza</code>.
	 */
	String sauce;
	/**
	 * A list to hold the topping ingredients to be added
	 * to this pizza.
	 */
	ArrayList<String> toppings = new ArrayList<String>();

	/**
	 * Gets the name of this <code>Pizza</code> object.
	 * 
	 * @return Name of this <code>Pizza</code> object.
	 */
	public String getName() {
		return name;
	}

	/**
	 * Prepares this <code>Pizza</code>: first the dough, then
	 * the sauce and finally the topping ingredients.
	 */
	public void prepare() {
		System.out.println("Preparing " + name);
	}

	/**
	 * Bakes this <code>Pizza</code> object.
	 */
	public void bake() {
		System.out.println("Baking " + name);
	}

	/**
	 * Cuts this <code>Pizza</code> object in slices
	 * (only a default way is supported, so far).
	 */
	public void cut() {
		System.out.println("Cutting " + name);
	}

	/**
	 * Boxes this <code>Pizza</code> object for delivery.
	 */
	public void box() {
		System.out.println("Boxing " + name);
	}

	/**
	 * Returns a readable <code>String</code> representing the
	 * content of this <code>Pizza</code> object.
	 * 
	 * @return <code>String</code> representation of this <code>Pizza</code> object.
	 */
	public String toString() {
		// code to display pizza name and ingredients
		StringBuffer display = new StringBuffer();
		display.append("---- " + name + " ----\n");
		display.append(dough + "\n");
		display.append(sauce + "\n");
		for (String topping : toppings) {
			display.append(topping + "\n");
		}
		return display.toString();
	}
}

