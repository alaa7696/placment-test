package object.oriented;

public class Circle extends Figure {
	private static final double PI = 3.141592653589793;
	
	private final double radius;

	public Circle(double radius) {
		this.radius = radius;
	}

	@Override
	public double perimeter() {
		return 2 * PI * radius;
	}

}
