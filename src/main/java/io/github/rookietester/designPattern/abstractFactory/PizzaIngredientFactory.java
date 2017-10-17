/**
 * 
 */
package io.github.rookietester.designPattern.abstractFactory;

import io.github.rookietester.designPattern.abstractFactory.ingredient.*;

/**
 * @author Administrator
 *         AbstractFactory：抽象工厂。抽象工厂定义了一个接口，所有的具体工厂都必须实现此接口，这个接口包含了一组方法用来生产产品。
 */
public interface PizzaIngredientFactory {//该工厂为抽象工厂，负责创建所有的原料。

	/*
	 * 在接口中，每个原料都有一个对应的方法创建该原料
	 */
	public Dough createDough();

	public Sauce createSauce();

	public Cheese createCheese();

	public Veggies[] createVeggies();

	public Pepperoni createPepperoni();

	public Clams createClams();
}
