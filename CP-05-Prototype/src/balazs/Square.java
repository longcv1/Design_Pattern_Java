package balazs;

public class Square extends Shape {

	public Square(int w, int h) {
		super(w, h);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void draw() {
		System.out.println("width: " + width + " height: " + height);
	}

	@Override
	public Shape clone() {
		return new Square(width, height);
	}
	
}
