import java.util.*;

public class Main {
  public static void main(String[] args) {
    Circle circle = new Circle(5);
    System.out.println("The area of the circle is: " + circle.area());

    Rectangle rectangle = new Rectangle(4, 7);
    System.out.println("\nRectangle details:");
    System.out.println(rectangle);
    System.out.println("Area of the rectangle: " + rectangle.calcArea());
    System.out.println("Perimeter of the rectangle: " + rectangle.calcPerimeter());

    rectangle.scale(2);
    System.out.println("\nRectangle after scaling by a factor of 2:");
    System.out.println(rectangle);
    System.out.println("Area after scaling: " + rectangle.calcArea());
    System.out.println("Perimeter after scaling: " + rectangle.calcPerimeter());

    System.out.println("\nDrawing the scaled rectangle:");
    rectangle.draw();
  }
}
