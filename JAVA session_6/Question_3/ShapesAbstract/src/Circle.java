
public class Circle implements Shape {
int radius;

	public Circle(int r) {
		radius=r;
	// TODO Auto-generated constructor stub
}
	@Override
	public void Draw() {
		// TODO Auto-generated method stub
		System.out.println("The shape is CIRCLE");

	}

	@Override
	public void getArea() {
		// TODO Auto-generated method stub
System.out.println("The area of this shape is:"+(2*3.12*radius));
	}

}
