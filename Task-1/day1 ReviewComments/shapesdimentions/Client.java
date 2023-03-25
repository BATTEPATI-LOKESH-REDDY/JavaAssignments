package day1.shapesdimentions;


public class Client {

	public static void main(String[] args) {
		Sphere sphere = new Sphere(5.0);
		Cuboid cuboid = new Cuboid(10.0);
		Circle c = new Circle(10.0);
		Square s = new Square(20.0);
		Triangle t = new Triangle(10.0, 11.0, 12.0);
		System.out.println("Area of the Sphere: " + sphere.calculateArea());
		System.out.println("Volume of the Sphere: " + sphere.calculateVolume());
		System.out.println("Area of the Cuboid: " + cuboid.calculateArea());
		System.out.println("Volume of the Cuboid: " + cuboid.calculateVolume());
		System.out.println("Area of the Circle: " + c.calArea());
		System.out.println("Permiter of the Circle: " + c.calPermiter());
		System.out.println("Area of the Square: " + s.calArea());
		System.out.println("Perimeter of the Square: " + s.calPermiter());
		System.out.println("Area of the triangle: " + t.calArea());
		System.out.println("Permiter of the Traingle: " + t.calPermiter());

	}

}