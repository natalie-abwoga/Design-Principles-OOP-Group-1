public class Shape {
    /**
     * Returns the area of the shape.
     * Default implementation returns 0.
     * Subclasses should override this method with appropriate logic.
     *
     * @return the area of the shape
     */
    public int getArea() {
        return 0;
    }
}

// Rectangle class: a proper subclass of Shape
public class Rectangle extends Shape {
    protected int width;
    protected int height;

    /**
     * Constructs a Rectangle with specified width and height.
     *
     * @param width the width of the rectangle
     * @param height the height of the rectangle
     */
    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    /**
     * Calculates and returns the area of the rectangle.
     *
     * @return the area of the rectangle
     */
    @Override
    public int getArea() {
        return width * height;
    }
}

// Square class: another valid subclass of Shape
public class Square extends Shape {
    protected int side;

    /**
     * Constructs a Square with equal sides.
     *
     * @param side the length of each side
     */
    public Square(int side) {
        this.side = side;
    }

    /**
     * Calculates and returns the area of the square.
     *
     * @return the area of the square
     */
    @Override
    public int getArea() {
        return side * side;
    }
}

// Main class to test Liskov Substitution Principle
public class LiskovSubstitutionDemo {

    /**
     * Accepts any Shape object and prints its area.
     *
     * @param shape the shape instance
     */
    public static void printShapeArea(Shape shape) {
        System.out.println("Computed Area: " + shape.getArea());
    }

    /**
     * Main method: Entry point of the program.
     *
     * @param args command-line arguments (not used)
     */
    public static void main(String[] args) {
        Shape rectangle = new Rectangle(10, 5);
        Shape square = new Square(7);

        printShapeArea(rectangle);  // Output: 50
        printShapeArea(square);     // Output: 49

       
    }
}
