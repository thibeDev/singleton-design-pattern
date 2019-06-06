public class App {

    public static void main(String[] args){

        for (int i = 1; i<=5; i++){
            ThreadedTask t = new ThreadedTask("Task " + i);
            t.start();
        }
    }
}
