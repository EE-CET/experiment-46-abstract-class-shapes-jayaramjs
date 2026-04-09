// Abstract class cannot be instantiated directly
abstract class Shape {
    // Abstract method: defined here, implemented in subclasses
    abstract void numberOfSides();
}

// Subclass providing specific implementation for Rectangle
class Rectangle extends Shape {
    @Override
    void numberOfSides() {
        System.out.println("Rectangle has 4 sides");
    }
}

// Subclass providing specific implementation for Triangle
class Triangle extends Shape {
    @Override
    void numberOfSides() {
        System.out.println("Triangle has 3 sides");
    }
}

// Subclass providing specific implementation for Hexagon
class Hexagon extends Shape {
    @Override
    void numberOfSides() {
        System.out.println("Hexagon has 6 sides");
    }
}

public class AbstractShapes {
    public static void main(String[] args) {
        // Create objects of each concrete subclass
        Rectangle rect = new Rectangle();
        Triangle tri = new Triangle();
        Hexagon hex = new Hexagon();

        // Call the overridden methods in the specified order
        rect.numberOfSides();
        tri.numberOfSides();
        hex.numberOfSides();
    }
}
