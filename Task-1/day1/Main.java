package day1;
import java.lang.Math.*;
interface ThreeD{
	double calculateArea();
	double calculateVolume();
}
interface TwoD{
	double calArea();
	double calPermiter();
	
}
class Sphere implements ThreeD{
	double radius;
	public Sphere(double radius) {
		this.radius=radius;
	}
	@Override
	public double calculateArea() {
		return 4*3.14*radius*radius;
	}
	@Override
	public double calculateVolume() {
		return  1.33*3.14*radius*radius*radius;
	}
	
	
	
}
class Cuboid implements ThreeD{
	double length;
	public Cuboid(double length) {
		this.length=length;
	}
	@Override
	public double calculateArea() {
		return 6*length*length;
	}
	@Override

	public double calculateVolume() {
		return length*length*length;
	}
	
	
	
}
class Circle implements TwoD{
	double radius;
	public Circle(double radius) {
		this.radius=radius;
	}
	
	@Override
	public double calArea() {
		return 3.14*radius*radius;
	}
	
	
	@Override
	public double calPermiter() {
		// TODO Auto-generated method stub
		return 2*3.14*radius;
	}
	
}
class Square implements TwoD{
	double length;
	public Square(double length) {
		this.length=length;
	}
	@Override
	public double calArea() {
		return length*length;
	}
	
	@Override
	public double calPermiter() {
		// TODO Auto-generated method stub
		return 4*length;
	}
}
class Triangle implements TwoD{
	double s1,s2,s3,s;
	public Triangle(double s1,double s2,double s3) {
		this.s1=s1;
		this.s2=s2;
		this.s3=s3;
	}
	@Override
	public double calArea(){
		s=(s1+s2+s3)/2;
		double k=Math.sqrt((s*(s-s1)*(s-s2)*(s-s3)));
		return k;
	}
	
	@Override
	public double calPermiter() {
		// TODO Auto-generated method stub
		return s1+s2+s3;
	}
}
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sphere sphere=new Sphere(5.0);
		Cuboid cuboid=new Cuboid(10.0);
		Circle c=new Circle(10.0);
		Square s=new Square(20.0);
		Triangle t=new Triangle(10.0,11.0,12.0);
		System.out.println("Area of the Sphere: "+sphere.calculateArea());
		System.out.println("Volume of the Sphere: "+sphere.calculateVolume());
		System.out.println("Area of the Cuboid: "+cuboid.calculateArea());
		System.out.println("Volume of the Cuboid: "+cuboid.calculateVolume());
		System.out.println("Area of the Circle: "+c.calArea());
		System.out.println("Permiter of the Circle: "+c.calPermiter());
		System.out.println("Area of the Square: "+s.calArea());
		System.out.println("Perimeter of the Square: "+s.calPermiter());
		System.out.println("Area of the triangle: "+t.calArea());
		System.out.println("Permiter of the Traingle: "+t.calPermiter());
	
		

	}

}
