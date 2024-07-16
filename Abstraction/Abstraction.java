package Abstraction;

abstract class Shape {
    abstract double calculatePerimeter();
    abstract double calculateArea();

    static class Circle extends Shape {
        double radius;
        final double pi = 3.14;

        Circle(double radius) {
            this.radius = radius;
        }

        @Override
        double calculatePerimeter() {
            return 2 * pi * radius;
        }

        @Override
        double calculateArea() {
            return pi * radius * radius;
        }
    }

    static class Rectangle extends Shape {
        double width;
        double height;

        Rectangle(double width, double height) {
            this.width = width;
            this.height = height;
        }

        @Override
        double calculatePerimeter() {
            return 2 * (width + height);
        }

        @Override
        double calculateArea() {
            return width * height;
        }
    }
}

public class Abstraction {
    public static void main(String[] args) {
        Shape.Circle circle = new Shape.Circle(10);
        System.out.println("Circle Area: " + circle.calculateArea());
        System.out.println("Circle Perimeter: " + circle.calculatePerimeter());

        Shape.Rectangle rectangle = new Shape.Rectangle(20, 30);
        System.out.println("Rectangle Area: " + rectangle.calculateArea());
        System.out.println("Rectangle Perimeter: " + rectangle.calculatePerimeter());
    }
}
