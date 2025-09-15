class armst
{

	public static void main(String args[])
	{

		int num=153;
		int sum=0,rem;
		int temp=num;
		while(num!=0)
		{
			rem=num%10;
			sum=sum+rem*rem*rem;
			num=num/10;
			
		}

		if(temp==sum)

		{

			System.out.printf("Armstrong %d",temp);
		}
		else
		{
			System.out.printf(" not Armstrong %d",temp);

		}
	}	
}