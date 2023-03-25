package day1.shapesdimentions;


class Cuboid implements ThreeDimentional {
	double length;

	public Cuboid(double length) {
		this.length = length;
	}

	@Override
	public double calculateArea() {
		return 6 * length * length;
	}

	@Override

	public double calculateVolume() {
		return length * length * length;
	}

}
