package balazs;

public class SortingManager {
	SortingStrategy strategy;
	
	public void setStrategy(SortingStrategy strategy) {
		this.strategy = strategy;
	}
	
	public void execute() {
		this.strategy.execute();
	}
}
