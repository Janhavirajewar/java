class payment
{
	int transid;
	double amout;
	String currency;
	
	payment() {
		
		System.out.println("by def payment");
		this.transid=0;
		this.amout=0;
		this.currency="not def";
				
	}
	payment(int transid, double amout, String currency) {
		
		System.out.println("payment para");
		this.transid = transid;
		this.amout = amout;
		this.currency = currency;
	}
	
	void display()
	{
		System.out.println("tras id ="+this.transid);
		System.out.println("amount ="+this.amout);
		System.out.println("currency ="+this.currency);
	}
}// payment ends here

class CreditCard extends payment
{
	String holdername;
	int expdate;
	CreditCard() {
		super();
		System.out.println("credit by def");
		this.holdername="notf";
		this.expdate=0;
		
		
	}
	CreditCard(int id,double amount,String currency,String holdername, int expdate) {
		super(id,amount,currency);
		System.out.println("credit para");
		this.holdername = holdername;
		this.expdate = expdate;
	}
	String getHoldername() {
		return holdername;
	}
	void setHoldername(String holdername) {
		this.holdername = holdername;
	}
	int getExpdate() {
		return expdate;
	}
	void setExpdate(int expdate) {
		this.expdate = expdate;
	}
	
	void display()
	{
		super.display();
		System.out.println("holdernmae ="+this.holdername);
		System.out.println("expirty ="+this.expdate);
	}
}// credit ends here

class Upi extends payment
{
	int upiid;
	int linkno;
	String appname;
	Upi() {
		super();
		System.out.println("upi by def");
		this.upiid=0;
		this.linkno=0;
		this.appname="not f";
	}
	Upi(int id,int amt,String currency ,int upiid, int linkno, String appname) {
		super(id,amt,currency);
		System.out.println("upi para");
		this.upiid = upiid;
		this.linkno = linkno;
		this.appname = appname;
	}
	int getUpiid() {
		return upiid;
	}
	void setUpiid(int upiid) {
		this.upiid = upiid;
	}
	int getLinkno() {
		return linkno;
	}
	void setLinkno(int linkno) {
		this.linkno = linkno;
	}
	String getAppname() {
		return appname;
	}
	void setAppname(String appname) {
		this.appname = appname;
	}
	void display()
	{
		super.display();
		System.out.println("upiid ="+this.upiid);
		System.out.println("linkno ="+this.linkno);
		System.out.println("appname ="+this.appname);
	}
}

 class testpayment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		payment p1=new payment();
		p1.display();
		System.out.println();
				
		CreditCard c1=new CreditCard(1111111111,100000,"inr","paro",2027);
		c1.display();
		System.out.println();

		CreditCard c2=new CreditCard(1000012,1200000,"dollor","shuru",2080);
		c2.display();
		System.out.println();

		Upi u1=new Upi(1212121,300,"inr",00000,1234567876,"gpay");
		u1.display();
	}

}
