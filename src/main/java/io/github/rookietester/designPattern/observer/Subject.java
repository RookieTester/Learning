/**
 * 主题接口
 */
package io.github.rookietester.designPattern.observer;

public interface Subject {

	public void registerObserver(Observer observer);

	public void removeObserver(Observer observer);

	public void notifyObserver();
}
