/**
 * 
 */
package designPattern.factory;

/**
 * @author Administrator
 *  ConcreteCreator：具体工厂。制造产品的实际工厂。它负责创建一个或者多个具体产品，只有ConcreteCreator类知道如何创建这些产品。
 */
public class ChicagoPizzaStore extends PizzaStore {

	Pizza createPizza(String type) {
		Pizza pizza = null;
		if ("cheese".equals(type)) {
			pizza = new ChicagoStyleCheesePizza();
		} else if ("clam".equals(type)) {
			// pizza = new ChicagoStyleClamPizza();
		} else if ("pepperoni".equals(type)) {
			// pizza = new ChicagoStylePepperoniPizza();
		} else if ("veggie".equals(type)) {
			// pizza = new ChicagoStyleVeggiePizza();
		}
		return pizza;
	}
}
