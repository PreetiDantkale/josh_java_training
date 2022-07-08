class Person{
  private String name;
  private int age;

  public Person(String n, int a){
    name = n;
    age = a;
  }

  public String getName(){
    return name;
  }

  public void setName(String myName){
    name = myName;
  }

  public int getAge(){
    return age;
  }

  public void setAge(int myAge){
    age = myAge;
  }

  public void printDetails(){
    System.out.println("Name: "+name+" Age: "+age);
  }

  public static void main(String args[]){

    Person p = new Person("John", 46);
    p.printDetails();
    
    p.setName("Clarie");
    p.setAge(21);
    p.printDetails();

    p.setName("Rio");
    System.out.print("Name: "+p.getName());
    p.setAge(28);
    System.out.println(" Age: "+p.getAge());
  }
}

// Output:
// Name: John Age: 46
// Name: Clarie Age: 21
// Name: Rio Age: 28