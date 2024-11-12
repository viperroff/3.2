public class Main {
    public static void main(String[] args) {

        //3.2.1

        Gun gun1 = new Gun(2);
        gun1.shoot();
        gun1.shoot();
        gun1.shoot();

        //3.2.2

        Fraction fraction1 = new Fraction(3, 4);
        Fraction fraction2 = new Fraction(2, 3);

        System.out.println(fraction1.sum(fraction2));
        System.out.println(fraction1.minus(fraction2));
        System.out.println(fraction1.multiply(fraction2));
        System.out.println(fraction1.div(fraction2));


        //3.2.3

        Sparrow sparrow1 = new Sparrow();
        Cuckoo cuckoo1 = new Cuckoo();
        Parrot parrot1 = new Parrot("Я попугай, изучающий Java. Моя задача - писать бэкэнд");

        sparrow1.sing();
        cuckoo1.sing();
        parrot1.sing();

        //3.2.4

        Point circleCenter = new Point(0, 0);
        Circle circle = new Circle(circleCenter, 5);
        System.out.println("Площадь круга: " + circle.area());

        Point squareTopLeft = new Point(1, 1);
        Square square = new Square(squareTopLeft, 4);
        System.out.println("Площадь квадрата: " + square.area());

        Point rectangleTopLeft = new Point(2, 2);
        Rectangle rectangle = new Rectangle(rectangleTopLeft, 6, 3);
        System.out.println("Площадь прямоугольника: " + rectangle.area());

        Point triangleVertex1 = new Point(0, 0);
        Point triangleVertex2 = new Point(4, 0);
        Point triangleVertex3 = new Point(2, 3);
        Triangle triangle = new Triangle(triangleVertex1, triangleVertex2, triangleVertex3);
        System.out.println("Площадь треугольника: " + triangle.area());


        //3.2.5

        PointXYZ pointXYZ1 = new PointXYZ(2, 4);
        System.out.println(pointXYZ1);

        PointXYZ pointXYZ2 = new PointXYZ(5, 3, 45, "желтая", "15:30");
        System.out.println(pointXYZ2);

        PointXYZ pointXYZ3 = new PointXYZ(54, 345, 2);
        System.out.println(pointXYZ3);

    }
}