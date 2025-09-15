class test {

	public static void main(String[] args)

		{
			char ch='A';

			if(ch>='A' && ch<='Z')
				{
					System.out.printf("upper cast");
				}
			
			else if(ch>='A' && ch<='Z')
			   	{
					System.out.printf("lower case");
				}					
			else if(ch>='0' && ch<='9')
				{
					System.out.printf("digit");

				}

			   else {
          				  System.out.println("Special Character");
      				 }


		}

}