package io.github.rookietester.designPattern.decorator;
/**
 * 测试类
 * @author Administrator
 *
 */
public class CoffeeShop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Coffee coffee1=new HouseBlend();
		System.out.println(coffee1.getDescription()+"$"+coffee1.cost());
		
		Coffee coffee2=new DarkRoast();
		coffee2=new Milk(coffee2);
		coffee2=new Mocha(coffee2);
		System.out.println(coffee2.getDescription()+"$"+coffee2.cost());
	}

}
