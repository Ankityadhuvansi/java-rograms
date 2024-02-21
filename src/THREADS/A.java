package THREADS;

public class A extends Thread{
    public void run(){
        for (int i = 0; i < 100; i++) {
            System.out.println("Hello");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
class B extends Thread{
    public void run(){
        for (int i = 0; i < 100; i++) {
            System.out.println("hii");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
class threads{
    public static void main(String[] args) {
        A ob1= new A();
        B ob2=new B();
//        ob2.setPriority(Thread.MAX_PRIORITY-5);
        ob1.start();
        ob2.start();
    }

}
