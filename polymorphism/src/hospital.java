import java.net.MulticastSocket;

class hospital
{
	String hosname;
	String address;
	hospital() {
		
		this.hosname="not specify";
		this.address="not specify";
		
	}
	hospital(String name, String address) {
		super();
		this.hosname = name;
		this.address = address;
	}
	String getName() {
		return hosname;
	}
	void setName(String name) {
		this.hosname = name;
	}
	String getAddress() {
		return address;
	}
	void setAddress(String address) {
		this.address = address;
	}
	
	void display()
	{
		System.out.println("name ="+this.hosname);
		System.out.println("address ="+this.address);
		
		
	}

}//  hospital ens here

class doctor extends hospital
{
	String docname;
	int yearofexp;
	doctor() {
		super();
		this.docname="notgiven";
		
	}
	doctor(String name,String address,String docname, int yearofexp) {
		super(name,address);
		this.docname = docname;
		this.yearofexp = yearofexp;
	}
	String getDocname() {
		return docname;
	}
	void setDocname(String docname) {
		this.docname = docname;
	}
	int getYearofexp() {
		return yearofexp;
	}
	void setYearofexp(int yearofexp) {
		this.yearofexp = yearofexp;
	}
	void display() {
		super.display();
		System.out.println("doctorname ="+this.docname);
		System.out.println("year of experience ="+this.yearofexp);
	}
	
}// doctro ends here

class surgeonn extends doctor
{
	String specialty;

	surgeonn() {
		super();
		this.specialty="not given";
		
	}

	surgeonn(String name,String address,String docname, int yearofexp,String specialty) {
		super(name,address,docname,yearofexp);
		this.specialty = specialty;
	}

	String getSpecialty() {
		return specialty;
	}

	void setSpecialty(String specialty) {
		this.specialty = specialty;
	}
	void display()
	{
		super.display();
		System.out.println("speciality ="+this.specialty);
	}
	
	
}// surgeon ends here


 class testhospital {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		hospital h1=new hospital("aadhar","nanded");
		h1.display();
		System.out.println();
		
		h1= new doctor("ashwini","nanded","gajanan",4);
		h1.display();
		System.out.println();
		
		h1=new surgeonn("gargi","nanded","ashwini",8,"ganyc");
		h1.display();
		System.out.println();
		
		
				

	}

}
