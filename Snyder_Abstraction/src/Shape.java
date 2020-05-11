/** Represents a shape.
 * @author Ian Snyder
 */
public abstract class Shape {

    protected Point position;
    private static int numShapes = 0;
    private static int id;

    /**
     *
     * Getters and Setters for member fields
     */

    public Point getPosition() {
        return position;
    }

    public static int getNumShapes() {
        return numShapes;
    }

    public static int getId() {
        return id;
    }

    public void setPosition(Point position) {
        this.position = position;
    }

    public static void setNumShapes(int numShapes) {
        Shape.numShapes = numShapes;
    }

    public static void setId(int id) {
        Shape.id = id;
    }

    /**
     * This method computes the area
     * @return double. Returns the area of the shape.
     */
    abstract public double computeArea();

    /**
     * TODO
     * getPerimter Abstract method
     * @return String for the object called.
     */

    abstract public double computePerimeter();

    /**
     *
     * getType Abstract method
     *
     * @return String for the object called.
     */
    public String toString() {
        return "Generic shape";
    }

}
