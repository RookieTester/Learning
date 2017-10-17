/**
 * 
 */
package io.github.rookietester.designPattern.abstractFactory;

import io.github.rookietester.designPattern.abstractFactory.ingredient.*;

/**
 * @author Administrator
 * ConcreteFactory：具体工厂。具体工厂是用于生产不同产品族。要创建一个产品，客户只需要使用其中一个工厂完全不需要实例化任何产品对象。
 */
public class NYPizzaIngredientFactory implements PizzaIngredientFactory {
//原料工厂创建完成之后，需要创建具体的原料工厂。该具体工厂只需要继承PizzaIngredientFactory，然后实现里面的方法即可。
	@Override  
    public Cheese createCheese() {  
        return new ReggianoCheese();  
    }  
  
    @Override  
    public Clams createClams() {  
        return new FreshClams();  
    }  
  
    @Override  
    public Dough createDough() {  
        return new ThinCrustDough();  
    }  
  
    @Override  
    public Pepperoni createPepperoni() {  
        return new SlicedPepperoni();  
    }  
  
    @Override  
    public Sauce createSauce() {  
        return new MarinaraSauce();  
    }  
  
    @Override  
    public Veggies[] createVeggies() {  
        Veggies veggies[] =  {new Garlic(),new Onion(),new Mushroom(),new RefPepper()};  
        return veggies;  
    }  
}
