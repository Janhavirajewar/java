
public class demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a=10;
		int b=2;
		int c;
		
		try
		{
			String fname=args[0];
			String lname=args[1];
			System.out.println("name is "+fname+ " "+ lname);
			
			c=a/b;
			System.out.println("result is : "+c);
	
			
		}
		
		catch(ArrayIndexOutOfBoundsException ar)
		{
			System.out.println("enter valid values");
		}
		catch(ArithmeticException ae)
			{
				System.out.println("enter non 0 2nd value");
			}
		catch(Exception e)
		{
			System.out.println("prblm occured");
		}
	}

}
