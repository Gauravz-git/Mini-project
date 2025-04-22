/*Class Shape with method area(). 
Subclasses: Circle, Rectangle, Triangle override area() to calculate respective areas. */
// Base class
class ShapeCalculator {
  // Method to be overridden
  double area() {
      return 0;
  }
}

// Subclass: Circle
class Circle extends ShapeCalculator {
  double radius;

  Circle(double radius) {
      this.radius = radius;
  }

  @Override
  double area() {
      return Math.PI * radius * radius;
  }
}

// Subclass: Rectangle
class Rectangle extends ShapeCalculator {
  double length, width;

  Rectangle(double length, double width) {
      this.length = length;
      this.width = width;
  }

  @Override
  double area() {
      return length * width;
  }
}

// Subclass: Triangle
class Triangle extends ShapeCalculator {
  double base, height;

  Triangle(double base, double height) {
      this.base = base;
      this.height = height;
  }

  @Override
  double area() {
      return 0.5 * base * height;
  }
}

// Test class
public class Main {
  public static void main(String[] args) {
      ShapeCalculator circle = new Circle(5);
      ShapeCalculator rectangle = new Rectangle(4, 6);
      ShapeCalculator triangle = new Triangle(3, 7);

      System.out.println("Area of Circle: " + circle.area());
      System.out.println("Area of Rectangle: " + rectangle.area());
      System.out.println("Area of Triangle: " + triangle.area());
  }
}
