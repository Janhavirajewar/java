class shape
{
	void calculatetriangle(triangle t1)
	{

		int area;
		area=t1.getbase()*t1.getheight();
		System.out.println("area of r"+area;);

	}
	
	void calculaterectangle(rectangle r1)
	{
		int area;
		area=r1.getlength()*r1.getbredth();
		System.out.println("area of r"+area;);
		
	}
	
}

class triangle
{
	int base;
	int height;
	
	triangle()
	{
		this.base=0;
		this.height=0;

	}

	triangle(int a,int b)
	{
		this.base=a;
		this.height=b;
	}
	
	void setbase(int b)
	{
		this.base=b;
	}
	void setheight(int b)
	{
		this.height=b;
	}
	
	int getbase()
	{
		retrn this.base=b;
	}
	int getheight()
	{
		return this.height=b;
	}
	
	void display()
	{
		System.out.println("base"+this.base);
		System.out.println("height"+this.height);
	}
}

class rectangle
{
	int length;
	int bredth;
	
	rectangle()
	{
		this.length=0;
		this.bredth=0;

	}

	rectangle(int a,int b)
	{
		this.length=a;
		this.bredth=b;
	}
	
	void setlength(int b)
	{
		this.length=b;
	}
	void setbredth(int b)
	{
		this.bredth=b;
	}
	
	int getlength()
	{
		retrn this.length=b;
	}
	int getbredth()
	{
		return this.bredth=b;
	}
	
	void display()
	{
		System.out.println("length"+this.length);
		System.out.println("bredth"+this.bredth);
	}

}

class test
{

	shape s1=new shape();
	triangle t1=new triangle(10,20);
	t1.display();
	s1.calculatetriangle(t1);
	
	rectangle r1=new rectangle()
	r1.display();
	s1.calculaterectangle(r1);
	
	
	
}