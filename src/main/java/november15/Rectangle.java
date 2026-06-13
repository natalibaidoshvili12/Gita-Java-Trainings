package november15;

public class Rectangle {

    double length;
    double width;

    public Rectangle() {

    }

    public Rectangle(double length1, double width1) {
        length = length1;
        width = width1;
    }

    double area() {
        return length * width;
    }

    double perimeter() {
        return 2 * (length + width);
    }

}
