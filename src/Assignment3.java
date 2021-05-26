import java.util.Scanner;

public class Assignment3 {

	public static void Go(Scanner scanner) {
		
		Shape[] shapes = new Shape[] {
				new Rectangle(2, 3),
				new Circle(1),
				new Triangle(2, 2)
		};
		
		for (Shape shape : shapes) {
			System.out.println(shape.calculateArea());
		}
		
		for (Shape shape : shapes) {
			shape.display();
		}
	}
}

interface Shape {
	double calculateArea();
	void display();
}

class Rectangle implements Shape {

	public double width;
	public double height;
	
	public Rectangle(int width, int height) {
		this.width = width;
		this.height = height;
	}

	@Override
	public double calculateArea() {
		return width * height;
	}

	@Override
	public void display() {
		System.out.println("Rectangle with width " + width + " and height " + height);
	}
}

class Circle implements Shape {

	public double radius;
	
	public Circle(int radius) {
		this.radius = radius;
	}

	@Override
	public double calculateArea() {
		return 2 * Math.PI * radius;
	}

	@Override
	public void display() {
		System.out.println("Circle with radius " + radius);
	}
}

class Triangle implements Shape {

	public double base;
	public double height;
	
	public Triangle(int base, int height) {
		this.base = base;
		this.height = height;
	}

	@Override
	public double calculateArea() {
		return 0.5 * base * height;
	}

	@Override
	public void display() {
		System.out.println("Triangle with base " + base + " and height " + height);
	}
}
