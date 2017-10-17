package io.github.rookietester.designPattern.decorator;
/**
 * Decorator: 抽象装饰类。是装饰抽象类，继承了Component,从外类来扩展Component类的功能，但对于Component来说，是无需知道Decorator存在的。
 * @author Administrator
 *
 */
public abstract class CondimentDecorator extends Coffee {

	public abstract String getDescription();
}
