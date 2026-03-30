public class ThreadMainMethod {
    public static void main(String[] args) {
        ThreadMethod tm= new ThreadMethod();
        Thread t1=new Thread(tm);
        t1.start();
    }
}
