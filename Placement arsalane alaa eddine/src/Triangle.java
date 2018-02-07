public class Triangle extends Shape {
    public Triangle(int x, int y) {
        super(x, y);
    }

    @Override
    public int area() {
        return x*y/2;
    }

}
