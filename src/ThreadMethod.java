public class ThreadMethod implements Runnable{
    @Override
    public void run() {
        try {
            System.out.println("Ekta");
            Thread.sleep(2000);
            System.out.println("Kumari");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
