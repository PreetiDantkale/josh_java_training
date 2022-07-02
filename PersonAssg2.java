// Write class Teacher and Student which extends class Person.
// Add properties Roll no, course, department in student class along with the constructor
// and getter, setters. Add properties department, specialization in Teacher
// class along with constructor and getter, setters.
// The constructor should accept all the properties of the person as
// well as the current class i.e Student or Teacher and set the properties.

class Person{
  int age;
  String name;

  public static void main(String args[]){
    Teacher t = new Teacher("MCA", "IT", "John", 27);
    t.printDetails();
    t.setDept("Engineering");
    t.setSpecialization("Elect");
    t.setName("Michel");
    t.setAge(88);
    System.out.println("Name: "+t.getName()+" Age: "+t.getAge()+" Dept: "+t.getDept()+" Spcl: "+t.getSpecialization());

    Student s = new Student(101, "BCA", "IT", "Clarie", 89);
    s.printDetails();
    s.setDept("MBA");
    s.setName("Romi");
    s.setAge(18);
    s.setRollNo(211);
    System.out.println("Name: "+s.getName()+" Age: "+s.getAge()+" Dept: "+s.getDept()+" RollNo:"+s.getRollNo());
  }
}

class Teacher extends Person{
  String dept, specialization;

  public Teacher(String d, String spc, String n, int a){
    dept = d;
    specialization = spc;
    name = n;
    age = a;
  }

  String getDept(){
    return dept;
  }

  void setDept(String myDept){
    dept = myDept;
  }

  String getSpecialization(){
    return specialization;
  }

  void setSpecialization(String mySpec){
    specialization = mySpec;
  }

  String getName(){
    return name;
  }

  void setName(String myName){
    name = myName;
  }

  int getAge(){
    return age;
  }

  void setAge(int myAge){
    age = myAge;
  }

  void printDetails(){
    System.out.println("Name: "+name+" Age: "+age+" Dept: "+dept+" Spcl: "+specialization);
  }

}

class Student extends Person{
  int rollNo;
  String course, dept;

  public Student(int r, String c, String d, String n, int a){
    rollNo = r;
    course = c;
    dept = d;
    name = n;
    age = a;
  }

  int getRollNo(){
    return rollNo;
  }

  void setRollNo(int myRollNo){
    rollNo = myRollNo;
  }

  String getDept(){
    return dept;
  }

  void setDept(String myDept){
    dept = myDept;
  }

  String getCourse(){
    return course;
  }

  void setCourse(String myCourse){
    course = myCourse;
  }

  String getName(){
    return name;
  }

  void setName(String myName){
    name = myName;
  }

  int getAge(){
    return age;
  }

  void setAge(int myAge){
    age = myAge;
  }

  void printDetails(){
    System.out.println("Name: "+name+" Age: "+age+" Dept: "+dept+" Roll No: "+rollNo+" Course:"+course);
  }
  
}