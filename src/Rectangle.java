class Rectangle extends Figure {
    private double width;
    private double height;
    private Point topLeft;

    public Rectangle(Point topLeft, double width, double height) {
        this.topLeft = topLeft;
        this.width = width;
        this.height = height;
    }

    @Override
    double area(){
        return width * height;
    }
}
