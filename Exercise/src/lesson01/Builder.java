package lesson01;

public class Builder {
	private Car car;
	public Builder (Car car) {
		this.car = car;
	}
	public Builder buildName(String name) {
		this.car.setBranchName(name);
		return this;
	}
	
	public Builder buildEngine(String engine) {
		this.car.setEngine(engine);
		return this;
	}
	
	public Builder buildSeat(int seat) {
		this.car.setSeats(seat);
		return this;
	}
	
	public Car build() {
		return this.car;
	}
}
