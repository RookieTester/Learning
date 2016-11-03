/**
 * 
 */
package designPattern.factory;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Administrator 
 * Product：抽象产品。所有的产品必须实现这个共同的接口，这样一来，使用这些产品的类就可以引用这个接口，而不是具体类。
 */
public abstract class Pizza {

	protected String name; // 名称
	protected String dough; // 面团
	protected String sause; // 酱料
	protected List<String> toppings = new ArrayList<String>(); // 佐料

	public void prepare() {
		System.out.println("Preparing " + name);
		System.out.println("Tossing dough");
		System.out.println("Adding sause");
		System.out.println("Adding toppings");
		for (int i = 0; i < toppings.size(); i++) {
			System.out.println("   " + toppings.get(i));
		}
	}

	public void bake() {
		System.out.println("Bake for 25 minutes at 350");
	}

	public void cut() {
		System.out.println("Cutting the pizza into diagonal slices");
	}

	public void box() {
		System.out.println("Place pizza in official PizzaStore box");
	}

	public String getName() {
		return name;
	}
}
