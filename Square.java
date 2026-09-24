public class Square extends Shape {
    private double l;

    public Square(double l) {
        this.l = l;
    }

    @Override
    public double area() {
        return l * l;
    }
}
