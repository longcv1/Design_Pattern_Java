package lesson01;

public class KiaCar extends Car {

	@Override
	public void showInfo() {
		System.out.println("===== KIA INFORMATION =====");
		String result = "";
		result += this.getBranchName() + " ";
		result += this.getEngine() + " ";
		result += this.getSeats();
		System.out.println(result);
	}
}
