package balazs;

public abstract class Shape {
	protected int width;
	protected int height;
	public Shape(int w, int h) {
		this.width = w;
		this.height = h;
	}
	
	public abstract void draw();
	
	public abstract Shape clone();
}
