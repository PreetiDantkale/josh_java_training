// Write a program with Sender class which has a send method that prints a
// message passed as a parameter. Then create a class ThreadedSend which extends Thread
// class and in constructor it accepts as message and Sender object.
// Now write a demo class which will create two threads using the ThreadedSend class.
// One thread will take the message as “Hi” and another thread will take message input
// as “Bye”. Now write a function which will print  “Hi” 1st and then “Bye”.

class Sender{

  void send(String msg){
    System.out.println(msg);
  }
}

class ThreadedSend extends Thread{
  String msg;
  Sender s;
  ThreadedSend(String msg, Sender s1){
    this.msg = msg;
    s = s1;
  }

  public void run(){
    s.send(msg);
  }
}
class Demo{
  public static void main(String args[]){
    Sender s = new Sender();
    ThreadedSend t1 = new ThreadedSend("Hi", s);
    ThreadedSend t2 = new ThreadedSend("Bye", s);
    t1.start();
    t2.start();
  } 
}