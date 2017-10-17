/**
 * 简单游戏工厂
 */
package io.github.rookietester.designPattern.simpleFactory;

/**
 * @author Administrator
 *
 */
public class SimpleGameFactory {

	public Game createGame(String gameType) {
		Game game = null;
		
		switch (gameType) {//根据参数选择返回的对象实例
		case "RPG":
			game = new RPGGame();
			break;

		default:
			game = new NormalGame();
			break;
		}
		return game;
	}
}
