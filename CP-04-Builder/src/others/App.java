package others;

public class App {

	public static void main(String[] args) {
		Director dir = new Director(new DepartmentBuilder());
		House department = dir.constructHouse("50m2", 5, 2);
		System.out.println(department);
	}

}
