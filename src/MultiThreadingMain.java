public class MultiThreadingMain {
    public static void main(String[] args) {
        MultiThreadingUsingRunnable m= new MultiThreadingUsingRunnable("work1");
        MultiThreadingUsingRunnable m1= new MultiThreadingUsingRunnable("work2");
        Thread t1=new Thread(m);
       // Thread.sleep(1000);
        Thread t2=new Thread(m1);
        t1.start();
        t2.start();
    }
}
