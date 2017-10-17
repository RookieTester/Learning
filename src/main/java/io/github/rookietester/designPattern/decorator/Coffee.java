package io.github.rookietester.designPattern.decorator;
/**
 * Component: 抽象构件。是定义一个对象接口，可以给这些对象动态地添加职责。
 * @author Administrator
 *
 */
public abstract class Coffee {

	protected String description="normal coffee";
	
	public String getDescription(){
		return description;
	}
	
	public abstract double cost();
}
