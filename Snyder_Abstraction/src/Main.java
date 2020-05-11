
class Main {
    public static void main(String[] args) {
        Circle circle1 = new Circle(new Point(1.0, 1.0), 1.0);
        Circle circle2 = new Circle(new Point(1.0, 1.0), 2.0);
        Circle circle3 = new Circle(new Point(4.0, 5.0), 9.0);

        Rectangle rectangle = new Rectangle(new Point(0.0, 1.0), 1.0, 1.0);
        Rectangle rectangle2 = new Rectangle(new Point(2.0, 2.0), 10, 18);

        // Print areas
        System.out.println("Area of circle 1 is: " + circle1.computeArea());
        System.out.println("Area of circle 2 is: " + circle2.computeArea());
        System.out.println("Area of circle 3 is: " + circle3.computeArea());
        System.out.println("Area of rectangle is: " + rectangle.computeArea());
        System.out.println("Area of rectangle2 is: " + rectangle2.computeArea());
        System.out.println("Perimeter circle1 is: " + circle1.computePerimeter());
        System.out.println("Perimeter circle2 is: " + circle2.computePerimeter());
        System.out.println("Perimeter circle3 is: " + circle3.computePerimeter());
        System.out.println("Perimeter rectangle is: " + rectangle.computePerimeter());
        System.out.println("Perimeter rectangle2 is: " + rectangle2.computePerimeter());
        System.out.println();

        // Print positions
        System.out.println("Circle 1 is at: (" + circle1.getPosition().getX() + ", " + circle1.getPosition().getY() + ")");

        System.out.println("Rectangle is at: (" + rectangle.getPosition().getX() + ", " + rectangle.getPosition().getY() + ")");
        System.out.println();

        // Prints number of shapes
        System.out.println("Number of shapes created: " + Shape.getNumShapes());

    }
}
