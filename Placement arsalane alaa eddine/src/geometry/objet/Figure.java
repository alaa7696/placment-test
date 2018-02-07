package geometry.objet;

public abstract class Figure {

	public static final Figure NO_FIGURE = new Figure() {
		
		@Override
		public double perimeter() {
			return 0;
		}
	};

	public abstract double perimeter();
}
