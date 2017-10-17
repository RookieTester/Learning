/**
 * 
 */
package io.github.rookietester.designPattern.factory;

/**
 * @author Administrator
 * Creator：抽象工厂。它实现了所有操纵产品的方法，但不实现工厂方法。Creator所有的子类都必须要实现factoryMethod()方法。
 */
public abstract class PizzaStore {

	public Pizza orderPizza(String type){  
        Pizza pizza;  
        pizza = createPizza(type);  
          
        pizza.prepare();  
        pizza.bake();  
        pizza.cut();  
        pizza.box();  
          
        return pizza;  
    }  
      
    /* 
     * 创建pizza的方法交给子类去实现 
     */  
    abstract Pizza createPizza(String type);
}
