public class RunnableMain {
    public static void main(String[] args) {
        ThreadUsingRunnable t= new ThreadUsingRunnable();
        Thread t1= new Thread(t);
        t1.start();
    }
}
