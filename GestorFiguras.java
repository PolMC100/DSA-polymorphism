import java.util.Arrays;

public class GestorFiguras {
    public static double sum(Shape[] figures) {
        double total = 0;
        for (Shape figure : figures) {
            total += figure.area();
        }
        return total;
    }

    public static void sort(Shape[] figures) {
        Arrays.sort(figures);
    }

    public static void print(Shape[] figures) {
        for (Shape figure : figures) {
            System.out.println(figure.area());
        }
    }

    public static void main(String[] args) {
        Shape[] v = new Shape[4];

        v[0] = new Rectangle(5, 3);
        v[1] = new Circle(5);
        v[2] = new Square(5);
        v[3] = new Circle(120);

        double res = sum(v);

        System.out.println("sum: " + res);

        print(v);

        sort(v);

        print(v);
    }
}