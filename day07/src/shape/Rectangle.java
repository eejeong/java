package shape;

public class Rectangle extends Shape {
	// class 속성
	private double width;
	private double height;
	
	// constructor
	public Rectangle() {
	}
	public Rectangle(double width, double height) {
		this.width = width;
		this.height = height;
	}
	public Rectangle(int x, int y, double width, double height) {
		super(x, y);
		this.width = width;
		this.height = height;
	}
	
	// Method
	@Override
	public double getArea() {
		return width * height;
	}

	@Override
	public double getCircumn() {
		return (width + height) * 2;
	}
}
