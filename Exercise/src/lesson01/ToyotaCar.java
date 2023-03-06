package lesson01;

public class ToyotaCar extends Car {

	@Override
	public void showInfo() {
		System.out.println("===== TOYOTA INFORMATION =====");
		String result = "";
		result += this.getBranchName() + " ";
		result += this.getEngine() + " ";
		result += this.getSeats();
		System.out.println(result);
	}	
}
