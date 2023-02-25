package balazs;

public class BaverageWithMilk extends BaverageDecorator {
	public BaverageWithMilk(Bavarage bavarage) {
		super(bavarage);
	}
	@Override
	public String description() {
		// TODO Auto-generated method stub
		return super.description() + "with milk";
	}
	@Override
	public double getPrice() {
		// TODO Auto-generated method stub
		return super.getPrice() + 5.0;
	}
}
