package geometry.objet;

public class Triangle extends Figure {

	private final double a;
	private final double b;
	private final double c;

	public Triangle(double a, double b, double c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}

	@Override
	public double perimeter() {
		return a + b + c;
	}

}
