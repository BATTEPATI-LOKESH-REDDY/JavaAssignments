package day1.shapesdimentions;


class Circle implements TwoDimentional {
	double radius;

	public Circle(double radius) {
		this.radius = radius;
	}

	@Override
	public double calArea() {
		return 3.14 * radius * radius;
	}

	@Override
	public double calPermiter() {
		return 2 * 3.14 * radius;
	}

}