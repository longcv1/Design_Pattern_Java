package balazs;

public class App {

	public static void main(String[] args) {
		SortingManager sort = new SortingManager();
		sort.setStrategy(new QuickSort());
		sort.execute();

//		OperationManager operator = new OperationManager();
//		operator.setStrategy(new Subtraction());
//		operator.execute(10, 20);
	}

}
