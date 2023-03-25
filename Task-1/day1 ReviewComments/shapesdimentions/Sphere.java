package day1.shapesdimentions;


public class Sphere implements ThreeDimentional {
	double radius;

	public Sphere(double radius) {
		this.radius = radius;
	}

	@Override
	public double calculateArea() {
		return 4 * 3.14 * radius * radius;
	}

	@Override
	public double calculateVolume() {
		return 1.33 * 3.14 * radius * radius * radius;
	}

}