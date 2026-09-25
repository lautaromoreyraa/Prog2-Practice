package practica;

public class Circle {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }

    public double getCircumference() {
        return 2 * Math.PI * radius;
    }

    @Override
    public String toString() {
        return " [radius=" + radius + ", area=" + getArea() + ", circumference=" + getCircumference() + "]";
    }

}

class Respuesta {
    public static void main(String[] args) {
        Circle circle = new Circle(1);
        System.out.println(circle.toString());
    }
}


