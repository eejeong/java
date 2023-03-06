package shape;

public abstract class Shape {
	// class 속성
	protected int x;
	protected int y;
	
	// constructor
	public Shape() {
	}
	public Shape(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	// Abstract Method 자식 클래스는 추상클래스의 함수를 반드시 구현해야 함
	public abstract double getArea();
	public abstract double getCircumn();
	
	public String getXY() {
		return x+" , "+y;
	}
}
