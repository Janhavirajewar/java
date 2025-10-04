class Human {
    String name;
    String gender;
    int age;

    Human() {
        System.out.println("Human by default");
        this.name = "notgiven";
        this.gender = "notgiven";
        this.age = 0;
    }

    Human(String name, String gender, int age) {
        System.out.println("Human parameterized");
        this.name = name;
        this.gender = gender;
        this.age = age;
    }

    String getName() {
        return name;
    }

    void setName(String name) {
        this.name = name;
    }

    String getGender() {
        return gender;
    }

    void setGender(String gender) {
        this.gender = gender;
    }

    int getAge() {
        return age;
    }

    void setAge(int age) {
        this.age = age;
    }

    void display() {
        System.out.println("name = " + this.name);
        System.out.println("gender = " + this.gender);
        System.out.println("age = " + this.age);
    }
} // Human ends here

class Student extends Human {
    int id;
    String section;

    Student() {
        super();
        System.out.println("Student by default");
        this.id = 0;
        this.section = "A";
    }

    Student(String name, String gender, int age, int id, String section) {
        super(name, gender, age);
        System.out.println("Student parameterized");
        this.id = id;
        this.section = section;
    }

    int getId() {
        return id;
    }

    void setId(int id) {
        this.id = id;
    }

    String getSection() {
        return section;
    }

    void setSection(String section) {
        this.section = section;
    }

    void display() {
        super.display();
        System.out.println("id = " + this.id);
        System.out.println("section = " + this.section);
    }
} // Student ends here

class CR extends Student {
    String selected;
    String responsibility;

    CR() {
        super();
        System.out.println("CR by default");
        this.selected = "not selected";
        this.responsibility = "not mentioned";
    }

    CR(String name, String gender, int age, int id, String section, String selected, String responsibility) {
        super(name, gender, age, id, section);
        this.selected = selected;
        this.responsibility = responsibility;
    }

    void display() {
        super.display();
        System.out.println("elected = " + this.selected);
        System.out.println("responsibility = " + this.responsibility);
    }
} // CR ends here

class ClubPresident extends Student {
    String clubname;
    int eventorg;

    ClubPresident() {
        super();
        System.out.println("ClubPresident by default");
        this.clubname = "notgiven";
        this.eventorg = 0;
    }

    ClubPresident(String name, String gender, int age, int id, String section, String clubname, int eventorg) {
        super(name, gender, age, id, section);
        this.clubname = clubname;
        this.eventorg = eventorg;
    }

    void display() {
        super.display();
        System.out.println("clubname = " + this.clubname);
        System.out.println("events organized = " + this.eventorg);
    }
} // ClubPresident ends here

class Teacher extends Human {
    String subject;
    int experienceYears;

    Teacher() {
        super();
        System.out.println("Teacher by default");
        this.subject = "notgiven";
        this.experienceYears = 0;
    }

    Teacher(String name, String gender, int age, String subject, int experienceYears) {
        super(name, gender, age);
        System.out.println("Teacher parameterized");
        this.subject = subject;
        this.experienceYears = experienceYears;
    }

    void display() {
        super.display();
        System.out.println("subject = " + this.subject);
        System.out.println("experienceYears = " + this.experienceYears);
    }
} // Teacher ends here

class Test {
    public static void main(String[] args) {
        Human h1 = new Human("Janhavi", "Female", 22);
        h1.display();
        System.out.println();

        Student s1 = new Student("Pallavi", "Female", 22, 101, "A");
        s1.display();
        System.out.println();

        Teacher t1 = new Teacher("Raj", "Male", 42, "Math", 22);
        t1.display();
        System.out.println();

        CR c1 = new CR("Ram", "Male", 21, 102, "B", "false", "no responsibility");
        c1.display();
        System.out.println();

        CR c2 = new CR();
        c2.display();
        System.out.println();

        ClubPresident cl1 = new ClubPresident();
        cl1.display();
    }
}
