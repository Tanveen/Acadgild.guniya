import java.util.Scanner;
public class DemoInterface implements Interfaceone {
public DemoInterface()
{

}
@Override
public void methodone()
{
	int number;
	System.out.println("enter any number");
	Scanner sn = new Scanner(System.in);
	number=sn.nextInt();
	System.out.println("the number you entered is:"+number);
	
}
}

