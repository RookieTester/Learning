package io.github.rookietester.designPattern.factory;

/**
 * @author Administrator
 * ConcreteCreator：具体工厂。制造产品的实际工厂。它负责创建一个或者多个具体产品，只有ConcreteCreator类知道如何创建这些产品。
 */
public class NYPizzaStore extends PizzaStore {

	@Override
	Pizza createPizza(String item) {
		Pizza pizza = null;
		if ("cheese".equals(item)) {
			pizza = new NYStyleCheesePizza();
		} else if ("veggie".equals(item)) {
			// pizza = new NYStyleVeggiePizza();
		} else if ("clam".equals(item)) {
			// pizza = new NYStyleClamPizza();
		} else if ("pepperoni".equals(item)) {
			// pizza = new NYStylePepperoniPizza();
		}

		return pizza;
	}
}
