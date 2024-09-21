import java.util.*;

public class Circle {
  private double radius;

  public Circle(int radius) {
    this.radius = radius;
  }

  public double area() {
    return Math.PI * Math.pow(this.radius, 2);
  }

  public static void main(String[] args) {
    Circle circle = new Circle(5);
    System.out.println("The area of the circle is: " + circle.area());
  }
}
