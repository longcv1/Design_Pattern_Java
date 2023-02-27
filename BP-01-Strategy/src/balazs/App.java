package balazs;

public class App {

	public static void main(String[] args) {
		OperationManager operator = new OperationManager();
		operator.setStrategy(new Subtraction());
		operator.execute(10, 20);
	}

}
