class Square extends Figure {
    private double sideLength;

    public Square(Point topLeft, double sideLength) {
        this.sideLength = sideLength;
    }

    @Override
    double area() {
        return sideLength * sideLength;
    }
}