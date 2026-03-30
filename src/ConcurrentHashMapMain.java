import java.util.HashMap;

public class ConcurrentHashMapMain {
    public static void main(String[] args) throws InterruptedException {
        ConcurrentHashmap cm = new ConcurrentHashmap();
        HashMap<Integer, String> map = new HashMap<Integer, String>();
        Thread t1 = new Thread(()->{
            map.put(1,"Java");
        });
        Thread t2 = new Thread(()->{
            map.put(1,"Spring");
        });
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println(map);
    }
}
