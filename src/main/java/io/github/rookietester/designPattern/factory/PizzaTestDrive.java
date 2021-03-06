/**
 * 
 */
package io.github.rookietester.designPattern.factory;

/**
 * @author Administrator 测试类
 */
public class PizzaTestDrive {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("---------Joel 需要的芝加哥的深盘披萨---------");
		ChicagoPizzaStore chicagoPizzaStore = new ChicagoPizzaStore(); // 建立芝加哥的披萨店
		Pizza joelPizza = chicagoPizzaStore.orderPizza("cheese"); // 下订单
		System.out.println("Joel ordered a " + joelPizza.getName() + "\n");

		System.out.println("---------Ethan 需要的纽约风味的披萨---------");
		NYPizzaStore nyPizzaStore = new NYPizzaStore();
		Pizza ethanPizza = nyPizzaStore.orderPizza("cheese");
		System.out.println("Ethan ordered a " + ethanPizza.getName() + "\n");
	}

}
