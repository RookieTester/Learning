/**
 * 
 */
package designPattern.abstractFactory;

/**
 * @author Administrator
 * Product：具体产品。
 */
public class CheesePizza extends Pizza {
//Pizza的代码利用相关的工厂生产原料。所生产的原料依赖所使用的工厂，Pizza类根本不关心这些原料，它只需要知道如何制作披萨即可。这里，Pizza和区域原料之间被解耦。
	PizzaIngredientFactory ingredientFactory;  
    
    /* 
     * 要制作披萨必须要有制作披萨的原料，而这些原料是从原料工厂运来的 
     */  
    public CheesePizza(PizzaIngredientFactory ingredientFactory){  
        this.ingredientFactory = ingredientFactory;  
        prepare();  
    }  
      
    /** 
     * 实现prepare方法 
     * prepare 方法一步一步地创建芝士比萨，每当需要原料时，就跟工厂要 
     */  
    void prepare() {  
        System.out.println("Prepareing " + name);  
        dough = ingredientFactory.createDough();  
        sauce = ingredientFactory.createSauce();  
        cheese = ingredientFactory.createCheese();  
    }  
}
