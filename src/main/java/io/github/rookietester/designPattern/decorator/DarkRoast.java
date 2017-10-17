package io.github.rookietester.designPattern.decorator;
/**
 * ConcreteComponent:具体构件。是定义了一个具体的对象，也可以给这个对象添加一些职责。
 * @author Administrator
 *
 */
public class DarkRoast extends Coffee {

	public DarkRoast(){
		description="DarkRoast";
	}
	
	@Override
	public double cost() {
		// TODO Auto-generated method stub
		return 1.05;
	}

}
