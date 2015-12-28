
public class Rectangle implements Shape {
int length;
int breadth;

	public Rectangle(int l, int b) {

		length=l;
		breadth=b;
	// TODO Auto-generated constructor stub
}
	@Override
	public void Draw() {
		// TODO Auto-generated method stub
System.out.println("The shape is RECTANGLE");
	}

	@Override
	public void getArea() {
		// TODO Auto-generated method stub
System.out.println("The area of this shape is:"+(length*breadth));
	}

}
