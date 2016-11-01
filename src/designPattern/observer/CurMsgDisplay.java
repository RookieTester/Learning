/**
 * 布告栏的实现，观察者注册的事件也在这里触发----具体观察者
 */
package designPattern.observer;

import java.util.ArrayList;

public class CurMsgDisplay implements Observer,DisplayElement {

	private int killCount;
	private Subject gameData;
	public CurMsgDisplay(Subject gameData) {
		// TODO Auto-generated constructor stub
		this.gameData=gameData;
		gameData.registerObserver(this);//注册观察者
	}
	
	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("The player in this game killed "+killCount+" zombie.");
	}
	@Override
	public void update(int killCount) {
		// TODO Auto-generated method stub
		this.killCount=killCount;
		display();
	}

}
