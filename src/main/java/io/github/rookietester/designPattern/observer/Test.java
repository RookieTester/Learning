package io.github.rookietester.designPattern.observer;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GameData gameData = new GameData();
		CurMsgDisplay curMsgDisplay = new CurMsgDisplay(gameData);
		gameData.setGameData(10);
		gameData.setGameData(2);
	}

}
