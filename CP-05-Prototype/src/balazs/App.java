package balazs;

public class App {

	public static void main(String[] args) {
		Shape s = new Square(10, 5);
		s.draw();
		Shape s_clone = s.clone();
		s_clone.draw();
	}

}
