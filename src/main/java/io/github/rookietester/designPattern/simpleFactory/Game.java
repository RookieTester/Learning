/**
 * 游戏类------抽象产品
 */
package io.github.rookietester.designPattern.simpleFactory;

/**
 * @author Administrator
 *
 */
public abstract class Game {

	public abstract void buy();
	public abstract void install();
	public abstract void start();
	public abstract void quit();
	public abstract void uninstall();
}
