class Shape
{
	String type;
	String bordertype;
	String color;
	static int count;
	static
	{
		count=0;
	}
	
	static int getcount()
	{
		return Shape.count;
	}
	
	Shape() {
		super();
		System.out.println("shpae by def");
		this.type="plane";
		this.bordertype="solid";
		this.color="white";	
		Shape.count++;
	}
	Shape(String type, String bordertype, String color) {
		super();
		System.out.println("shpae parameterized");

		this.type = type;
		this.bordertype = bordertype;
		this.color = color;
		Shape.count++;
	}
	String getType() {
		return type;
	}
	void setType(String type) {
		this.type = type;
	}
	String getBordertype() {
		return bordertype;
	}
	void setBordertype(String bordertype) {
		this.bordertype = bordertype;
	}
	String getColor() {
		return color;
	}
	void setColor(String color) {
		this.color = color;
	}
	
	void display()
	{
		System.out.println("type ="+this.type);
		System.out.println("bordertype ="+this.bordertype);
		System.out.println("color ="+this.color);
	}
	
	void calculatearea()
	{
		System.out.println("calculatearea is created");
	}
	
}// shape ends here

class Triangle extends Shape
{
	int base;
	int height;
	Triangle() {
		super();
		System.out.println("triangle by def");
		
		this.base=0;
		this.height=0;
	}
	Triangle(String type,String bordertype,String color,int base, int height) {
		super(type,bordertype,color);
		
		System.out.println("triangle para");
		this.base = base;
		this.height = height;
	}
	int getBase() {
		return base;
	}
	void setBase(int base) {
		this.base = base;
	}
	int getHeight() {
		return height;
	}
	void setHeight(int height) {
		this.height = height;
	}
	
	void dislay()
	{
		super.display();
		System.out.println("base ="+this.base);
		System.out.println("height ="+this.height);
		
	}
	
	void calculatearea() {
		
		double c = 0.5*this.base*this.height;
		System.out.println("area is"+c);
	}
	
}// triangle ends here

class Rectangle extends Shape // rect is a shape
{
	int length;
	int bredth;
	Rectangle() {
		super();
		System.out.println("rect by def");
		this.length=0;
		this.bredth=0;
	}

	Rectangle(String type,String bordertype,String color,int length, int bredth) {
		super(type,bordertype,color);
		System.out.println("rect para");
		this.length = length;
		this.bredth = bredth;
	}

	int getLength() {
		return length;
	}
	void setLength(int length) {
		this.length = length;
	}
	int getBredth() {
		return bredth;
	}
	void setBredth(int bredth) {
		this.bredth = bredth;
	}
	
	void display()
	{
		super.display();
		System.out.println("length ="+this.length);
		System.out.println("bredth ="+this.bredth);
		
	}
	
	void calculatearea()
	{
		int c=this.length*this.bredth;
		System.out.println("area is"+c);
	}
	
}// rect

 class testshape {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Shape s1=new Shape("plane","solid","red");
		s1.setType("circle");
		s1.calculatearea();
		s1.display();
		System.out.println();
		
		 s1=new Triangle("equlateraltriangle","dotted","black",10,20);
		 s1.calculatearea();
		System.out.println();
		
		 s1=new Triangle();
		 s1.calculatearea();
		System.out.println();

		s1=new Rectangle("rectangle","dassed","brown",2,3);
		s1.calculatearea();
		System.out.println();
		
		int c = Shape.getcount();   // call method and store value
		System.out.println("count is " + c);

	}

}
