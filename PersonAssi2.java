// Write class Teacher and Student which extends class Person.
// Add properties Roll no, course, department in student class along with the constructor
// and getter, setters. Add properties department, specialization in Teacher
// class along with constructor and getter, setters.
// The constructor should accept all the properties of the person as
// well as the current class i.e Student or Teacher and set the properties.

class PersonAssi2 {
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

class Teacher extends PersonAssi2{
  String dept, specialization;

  public Teacher(String dept, String specialization, String name, int age){
    this.dept = dept;
    this.specialization = specialization;
    this.name = name;
    this.age = age;
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

class Student extends PersonAssi2{
  int rollNo;
  String course, dept;

  public Student(int rollNo, String course, String dept, String name, int age){
    this.rollNo = rollNo;
    this.course = course;
    this.dept = dept;
    this.name = name;
    this.age = age;
  }

  int getRollNo(){
    return rollNo;
  }

  void setRollNo(int rollNo){
    this.rollNo = rollNo;
  }

  String getDept(){
    return dept;
  }

  void setDept(String dept){
    this.dept = dept;
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

  void setName(String name){
    this.name = name;
  }

  int getAge(){
    return age;
  }

  void setAge(int age){
    this.age = age;
  }

  void printDetails(){
    System.out.println("Name: "+name+" Age: "+age+" Dept: "+dept+" Roll No: "+rollNo+" Course:"+course);
  }
}