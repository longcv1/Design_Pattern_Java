package balazs;

public class App {

	public static void main(String[] args) {
		SortingManager sort = new SortingManager();
		sort.setStrategy(new QuickSort());
		sort.execute();
	}

}
