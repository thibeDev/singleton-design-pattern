public class ThreadedTask extends Thread {
    private String taskName;

    public ThreadedTask(String taskName) {
        this.taskName = taskName;
    }

    @Override
    public void run(){
       Singleton s = Singleton.getInstance();
       s.process(taskName);
    }
}
