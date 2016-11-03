/**
 * 
 */
package designPattern.factory;

/**
 * @author Administrator 
 * ConcreteProduct：具体产品
 */
public class NYStyleCheesePizza extends Pizza {

	public NYStyleCheesePizza() {
		name = "Ny Style Sauce and Cheese Pizza";
		dough = "Thin Crust Dough";
		sause = "Marinara Sauce";

		toppings.add("Crated Reggiano Cheese");
	}
}
