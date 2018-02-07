package geometry.objet;

public class FigureFactory {

	public Figure create(String code, double... dimensions) {
		if ("triangle".equals(code)) {
			return new Triangle(dimensions[0], dimensions[1], dimensions[2]);
		}

		if ("circle".equals(code)) {
			return new Circle(dimensions[0]);
		}

		return Figure.NO_FIGURE;
	}

}
