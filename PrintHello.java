// Write a class with method talk which prints hello and then
// overload the talk method
// by taking in a name and printing “Hello” with that name.

class PrintHello{

  void talk(){
    System.out.println("Hello");
  }

  void talk(String name){
    System.out.println("Hello "+name);
  }

  public static void main(String args[]){
    PrintHello p = new PrintHello();
    p.talk();
    p.talk("John");
  }
}