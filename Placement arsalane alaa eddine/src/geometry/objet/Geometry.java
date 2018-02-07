package geometry.objet;


public class Geometry {
	
	public static double perimeter(String code, double... dimensions) {
		Figure figure = new FigureFactory().create(code, dimensions);
		return figure.perimeter();
	}

}
