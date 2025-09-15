class test{

	public static void main(String[] args)
	{
		int year=1970;

		if(year%4==0 && year%100!=0 || year%400==0)
		{
			System.out.printf("year is leap");
		}
		
		else
		{
			System.out.printf("year is not leap");

		}

		
	}

}