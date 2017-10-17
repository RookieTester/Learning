package io.github.rookietester.designPattern.decorator;
/**
 * ConcreteDecorator:具体装饰类，起到给Component添加职责的功能。
 * @author Administrator
 *
 */
public class Milk extends CondimentDecorator {

	Coffee coffee;
	
    public Milk(Coffee coffee) {
		// TODO Auto-generated constructor stub
		this.coffee=coffee;
	}
	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return coffee.getDescription()+",milk";
	}

	@Override
	public double cost() {
		// TODO Auto-generated method stub
		return coffee.cost()+0.3;
	}

}
