class str
{

	public static void main(String args[])
	{

		int no=145;
		int fact,sum=0,rem;
		int original=no;
		while(no!=0)

		{
			rem=no%10;
			fact=1;
			for(int i=1;i<=rem;i++)
			{
				fact=fact*i;
			}
			sum=sum+fact;
			no=no/10;
		}

			 if (sum == original)
     			  	 System.out.printf("%d is a Strong Number\n", original);
    			else
        			System.out.printf("%d is NOT a Strong Number\n", original);

	}

}