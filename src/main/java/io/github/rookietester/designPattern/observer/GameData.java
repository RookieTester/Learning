/**
 * 实现主题接口-----具体主题
 */
package io.github.rookietester.designPattern.observer;

import java.util.ArrayList;
import java.util.List;

public class GameData implements Subject {

	private List<Observer> observers;
	private int killCount;

	public GameData() {
		// TODO Auto-generated constructor stub
		observers = new ArrayList<Observer>();
	}

	@Override
	public void registerObserver(Observer observer) {
		// TODO Auto-generated method stub
		observers.add(observer);
	}

	@Override
	public void removeObserver(Observer observer) {
		// TODO Auto-generated method stub
		int i = observers.indexOf(observer);
		if (i >= 0) {
			observers.remove(i);
		}
	}

	@Override
	public void notifyObserver() {
		// TODO Auto-generated method stub
		for (int i = 0; i < observers.size(); i++) {
			Observer observer = observers.get(i);
			observer.update(killCount);
		}
	}
	
	public void setGameData(int killCount){
		this.killCount=killCount;
		notifyObserver();
	}

}
