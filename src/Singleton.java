public class Singleton {

    private static final Singleton singleton;
    private int count;

    static {
        singleton = new Singleton();
    }

    private Singleton(){
        System.out.println("Singleton only one instantiation");
    }

    public static Singleton getInstance(){
        return singleton;
    }


    //removing synchronized makes threads access count attribute in same time and generate wrong output
    public synchronized void process(String taskName){
        System.out.println("-------->Processing task " + taskName);
        for(int i = 1; i <= 5; i++){
            count++;
            System.out.println("--> count = " + count);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}
