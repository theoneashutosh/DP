package observer;

public interface Subject {

	public boolean registerObserver(Observer observer);
	
	public boolean deleteObserver(Observer observer);
	
	public void notifyObserver();
}
