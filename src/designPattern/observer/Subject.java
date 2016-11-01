/**
 * 主题接口
 */
package designPattern.observer;

public interface Subject {

	public void registerObserver(Observer observer);

	public void removeObserver(Observer observer);

	public void notifyObserver();
}