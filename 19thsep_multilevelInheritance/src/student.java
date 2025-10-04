
 class person {

	
	 String name;
	 int age;
	 String gender;
	 
	 
	person() {
		
		System.out.println("peerson by def");
		this.name="notf";
		this.age=0;
			
	}



	person(String name, int age,String gender) {
		super();
		System.out.println("person para");
		this.name = name;
		this.age = age;
		this.gender=gender;
	}

	

	
	String getName() {
		return name;
	}



	void setName(String name) {
		this.name = name;
	}



	int getAge() {
		return age;
	}



	void setAge(int age) {
		this.age = age;
	}



	String getGender() {
		return gender;
	}



	void setGender(String gender) {
		this.gender = gender;
	}



	void display()
	{
		System.out.println("name ="+this.name);
		System.out.println("age ="+this.age);
		System.out.println("gender ="+this.gender);
	}

}// person ends here
 
 class student extends person
 {
	 String cource;
	 int id;
	 
	student() {
		super();
		System.out.println("student by def");
		this.cource="notf";
		this.id=0;
	}

	student(String name,int age,String gender,String cource, int id) {
		super(name,age,gender);
		System.out.println("student para");
		this.cource = cource;
		this.id = id;
	}

	String getCource() {
		return cource;
	}

	void setCource(String cource) {
		this.cource = cource;
	}

	int getId() {
		return id;
	}

	void setId(int id) {
		this.id = id;
	}
	
	void display() {
		
		super.display();
		System.out.println("cource ="+this.cource);
		System.out.println("id ="+this.id);
	}
	
 } //student ends here
 
 
 class GraduateStudent extends student
 {
	 String specilization;

	GraduateStudent() {
		super();
		System.out.println("by deg graduate");
		this.specilization="notf";
	}

	GraduateStudent(String name,int age,String gender,String cource,int id,String specilization) {
		super(name,age,gender,cource,id);
		System.out.println("graduate para ");
		this.specilization = specilization;
	}

	String getSpecilization() {
		return specilization;
	}

	void setSpecilization(String specilization) {
		this.specilization = specilization;
	}

	void display()
	{
		super.display();
		System.out.println("spec ="+this.specilization);
	}
	 
	 
 }

 class testperson
 {
	 public static void main(String[] args)
	 {
		 person p1=new person("janhavi",22,"female");
		 p1.display();
		 System.out.println();

		 student s1=new student("pallavi",22,"female","mca",11);
		 s1.display();
		 System.out.println();
		 
		 student s2=new student();
		 s2.display();
		 System.out.println();
		 
		 GraduateStudent g1=new GraduateStudent("Eshan",22,"male","btech",11,"JAVA");
		 g1.display();
		 System.out.println();
		 
		 GraduateStudent g2=new GraduateStudent("Eshani",22,"female","be",1,"c");
		 g2.display();
		 System.out.println();
		 
		 
	 }
 }