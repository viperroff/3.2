class Circle extends Figure {
    private double radius;
    private Point center;

    public Circle(Point center, double radius) {
        this.center = center;
        this.radius = radius;
    }

    @Override
    double area() {
        return Math.PI * radius * radius;
    }
}