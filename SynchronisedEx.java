//Write a program which will create two threads and print the 10 numbers in sequence.
class PrintNumbers{

  synchronized public void printNumbers(int start_with, int end_with ){
    for(int i = start_with; i <=end_with; i++){
      System.out.println(i);
      try{  
        Thread.sleep(100);  
      }
      catch(Exception e){
        System.out.println(e);
      } 
    }
     
  }
}

class DemoThread1 extends Thread{
  PrintNumbers p;

  DemoThread1(PrintNumbers p){
    this.p = p;
  }
  public void run(){
    p.printNumbers(1,5);
  }
}

class DemoThread2 extends Thread{
  PrintNumbers p;
  DemoThread2(PrintNumbers p){
    this.p = p;
  }
  public void run(){
    p.printNumbers(6,10);
  }
}

class SynchronisedEx{
  public static void main(String args[]){
    PrintNumbers p = new PrintNumbers();
    DemoThread1 d1 = new DemoThread1(p);
    DemoThread2 d2 = new DemoThread2(p);
    d1.start();
    d2.start();
  }
}
