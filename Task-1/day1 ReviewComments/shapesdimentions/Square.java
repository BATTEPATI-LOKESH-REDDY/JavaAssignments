package day1.shapesdimentions;


class Square implements TwoDimentional {
	double length;

	public Square(double length) {
		this.length = length;
	}

	@Override
	public double calArea() {
		return length * length;
	}

	@Override
	public double calPermiter() {
		return 4 * length;
	}
}