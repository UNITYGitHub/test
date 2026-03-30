public class MultiThreadingUsingRunnable implements Runnable {
    private String task;
    public MultiThreadingUsingRunnable(String task){
        this.task=task;

    }
    @Override
    public void run() {
        System.out.println(task +" completed");
    }
}
