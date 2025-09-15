class TIME{

	int hour,min,sec;

	void sethour(int a)
	{
		this.hour=a;
	}

	void setmin(int a)
	{
		this.min=a;
	}

	void setsec(int a)
	{
		this.sec=a;
	}


}
class TEST{
		public static void main(String[] args)

		{
			TIME t1;
			t1=new TIME();
			
			t1.sethour(3);
			System.out.println(t1.hour);
			
			t1.setmin(12);
			System.out.println(t1.min);

			t1.setsec(30);
			System.out.println(t1.sec);	
		

		}
}