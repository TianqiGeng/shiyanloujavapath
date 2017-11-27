package Design;

public interface OSubject {
	public void registerObserver(OObserver o);
	public void removeObserver(OObserver o);
	public void notifyAllObservers();
}
