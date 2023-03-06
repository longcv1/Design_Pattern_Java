package lesson01;

public class AudiCar extends Car{
	@Override
	public void showInfo() {
		System.out.println("===== AUDI INFORMATION =====");
		String result = "";
		result += this.getBranchName() + " ";
		result += this.getEngine() + " ";
		result += this.getSeats();
		System.out.println(result);
	}
}
