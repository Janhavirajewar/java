class Book{
	
	String name;
	int price;
	String author;
	String publisher;

	void setname(String a)
	{
		this.name=a;
	}
	
	void setprice(int a)
	{
		this.price=a;
	}

	void setauthor(String a)
	{
		this.author=a;
	}

	void setpublisher(String a)
	{
		this.publisher=a;
	}

	String getname()
	{
		return this.name;
	}
	
	int getprice()
	{
		return this.price;
	}

	String getauthor()
	{
		return this.author;
	}

	String getpublisher()
	{
		return this.publisher;
	}

	Book()
	{
		this.name=null;
		this.price=0;
		this.author="notd";
		this.publisher="notf";
	}

	Book(String a,int b,String c,String d)
	{
		this.name=a;
		this.price=b;
		this.author=c;
		this.publisher=d;
	}

	void display()
	{
		
        System.out.println("Title: " + name);
	System.out.println("Price: ₹" + price);
        System.out.println("Author: " + author);
        System.out.println("Publisher: " + publisher);
            
	}
}
class testbook
{
	public static void main(String[] args)
	{
		Book b1;
		b1=new Book("Introduction to Algorithms",900,"Thomas H. Cormen" ,"MIT press");
		b1.display();

		
		b1.setname("Core Java");
		
		b1.setprice(500);
				
		b1.setauthor("Herbert Schildt");
		
		b1.setpublisher("McGraw-Hill");
		
		b1.display();
	}

}