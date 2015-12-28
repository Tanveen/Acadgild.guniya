
public class Square implements Shape {
int side;
public Square(int s)
{
	side=s;
}
	@Override
	public void Draw() {
		// TODO Auto-generated method stub
		System.out.println("The shape is SQUARE");

	}

	@Override
	public void getArea() {
		// TODO Auto-generated method stub
System.out.println("The area of this shape is:"+(2*side));
	}

}
