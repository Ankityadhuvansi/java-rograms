package THREADS;

public class thread {
    public static void main(String[] args){
        Runnable obj1=new C();
        Runnable obj2=new D();
        Thread t1=new Thread(obj1);
        Thread t2=new Thread(obj2);
        t1.start();
        t2.start();
    }
}
 class C implements Runnable{

     @Override
     public void run() {
         for (int i = 0; i < 5; i++) {
             System.out.println("Hi");
         }
     }
 }
 class D implements Runnable{
   public void run(){
       for (int i = 0; i < 5; i++) {
           System.out.println("Hello");
       }
    }
 }
