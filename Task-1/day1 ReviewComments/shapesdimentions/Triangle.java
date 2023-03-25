package day1.shapesdimentions;


class Triangle implements TwoDimentional {
	double side1, side2, side3, halfPerimeter;

	public Triangle(double side1, double side2, double side3) {
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
	}

	@Override
	public double calArea() {
		halfPerimeter = (side1 + side2 + side3) / 2;
		double k = Math.sqrt((halfPerimeter * (halfPerimeter - side1) * (halfPerimeter - side2) * (halfPerimeter - side3)));
		return k;
	}

	@Override
	public double calPermiter() {
		return side1 + side2 + side3;
	}
}
