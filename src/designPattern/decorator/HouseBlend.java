package designPattern.decorator;
/**
 * ConcreteComponent:具体构件。是定义了一个具体的对象，也可以给这个对象添加一些职责。
 * @author Administrator
 *
 */
public class HouseBlend extends Coffee {

	public HouseBlend(){
		description="HouseBlend";
	}
	
	@Override
	public double cost() {
		// TODO Auto-generated method stub
		return 0.89;
	}

}
