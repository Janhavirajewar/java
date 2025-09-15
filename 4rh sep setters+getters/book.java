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
		b1=new Book();
		
		b1.setname("Core Java");
		System.out.println(b1.getname());

		b1.setprice(500);
		System.out.println(b1.getprice());
		
		b1.setauthor("Herbert Schildt");
		System.out.println(b1.getauthor());


		b1.setpublisher("McGraw-Hill");
		System.out.println(b1.getpublisher());

		b1.display();
	}

}