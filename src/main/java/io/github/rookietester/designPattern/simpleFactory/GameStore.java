/**
 * 游戏商店------相当于客户端
 */
package io.github.rookietester.designPattern.simpleFactory;

public class GameStore {

	private SimpleGameFactory factory;
	public GameStore(SimpleGameFactory factory){
		this.factory=factory;
	}
	
	public Game playGame(String gameType){
		Game game=factory.createGame(gameType);
		game.buy();
		game.install();
		game.start();
		game.quit();
		game.uninstall();
		return game;
	}
}
