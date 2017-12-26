
public class ThisTest 
{
	
	int len;
	int breadth;
	int ar;
	
	public ThisTest(int i,int j)
	{
		len=i;
		breadth=j;
		System.out.println("Inside two parameter constructor");
	}
	
	public ThisTest(int i)
	{
		this(i,i);
		System.out.println("Inside one parameter constructor");
		
	}
	
	
	int area()
	{
		System.out.println("Inside area method");
		ar=len*breadth;
		return(ar);
	}
	
	void display()
	{
		System.out.println("area is");
		System.out.println(ar);
	}
	
	public static void main(String[] args) 
	{

		ThisTest square=new ThisTest(2);
		square.area();
		square.display();
		ThisTest rectangle=new ThisTest(3, 4);
		rectangle.area();
		rectangle.display();

	}

}
