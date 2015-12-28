
public class ShapeArea {
public static void main(String[] args)
{
	Shape s1 =new Rectangle(20,30);
	s1.Draw();
	s1.getArea();
	
	Shape s2 =new Square(3);
	s2.Draw();
	s2.getArea();
	
	Shape s3 =new Circle(5);
	s3.Draw();
	s3.getArea();
	
	System.out.println("This is the main class");
}
}
