
public class Prime {
public static void main(String[] args){
	System.out.println("Printing prime numbers from 1 to 100");
	int i,j;
	int count;
	for(i=1;i<100;i++)
	{
		count=0;
		for(j=2;j<i;j++)
		{
			if(i%j==0)
			{
				count=count+1;
				break;
			}
		}
		if(count==0)
		{
			System.out.println(i);
		}
	}
	}
}

