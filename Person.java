class Person{
  private String name;
  private int age;

  public Person(String name, int age){
    this.name = name;
    this.age = age;
  }

  public String getName(){
    return name;
  }

  public void setName(String name){
    this.name = name;
  }

  public int getAge(){
    return age;
  }

  public void setAge(int age){
    this.age = age;
  }

  public void printDetails(){
    System.out.println("Name: "+this.name+" Age: "+this.age);
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