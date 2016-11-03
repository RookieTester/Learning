/**
 * 
 */
package designPattern.abstractFactory;

/**
 * @author Administrator
 * Product：具体产品。
 */
public class ClamPizza extends Pizza {
//Pizza的代码利用相关的工厂生产原料。所生产的原料依赖所使用的工厂，Pizza类根本不关心这些原料，它只需要知道如何制作披萨即可。这里，Pizza和区域原料之间被解耦。
	PizzaIngredientFactory ingredientFactory;  
    
    public ClamPizza(PizzaIngredientFactory ingredientFactory){  
        this.ingredientFactory = ingredientFactory;  
    }  
      
    @Override  
    void prepare() {  
        System.out.println("Prepare " + name);  
        dough = ingredientFactory.createDough();  
        sauce = ingredientFactory.createSauce();  
        cheese = ingredientFactory.createCheese();  
        clams = ingredientFactory.createClams();        
    }  
}
