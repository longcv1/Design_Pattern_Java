package balazs;

public class OperationManager {
	Calculation calculator;
	
	void setStrategy(Calculation cal) {
		this.calculator = cal;
	}
	
	public void execute(int n1, int n2) {
		int result = this.calculator.execute(n1, n2);
		System.out.println("Result: " + result);
	}
}
