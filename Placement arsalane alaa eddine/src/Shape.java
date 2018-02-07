public abstract class Shape {
    protected final int x;
    protected final int y;

    public Shape(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public abstract int area();
}
