package balazs;

public abstract class BaverageDecorator implements Bavarage {

	protected Bavarage bavarage;
	public BaverageDecorator (Bavarage bavar) {
		this.bavarage = bavar;
	}
	
	@Override
	public String description() {
		return bavarage.description();
	}
	@Override
	public double getPrice() {
		return bavarage.getPrice();
	}
}
