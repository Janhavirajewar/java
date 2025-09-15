class pali
{

	public static void main(String args[])
	{

		int num=12551;
		int rev=0,rem;
		int temp=num;
		while(num!=0)
		{
			rem=num%10;
			rev=rev*10+rem;
			num=num/10;
			
		}

		if(temp==rev)

		{

			System.out.printf("palindrome is %d",temp);
		}
		else
		{
			System.out.printf("no is not palindrome  %d",temp);

		}
	}

}