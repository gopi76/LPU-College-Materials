public class ThreadDemo extends Thread {
    public void run() {
        System.out.println("Priotity of thread is :- " + Thread.currentThread().getPriority());
    }

    public static void main(String[] args) {

        ThreadDemo obj = new ThreadDemo();
        obj.start();

        System.out.println(obj.getName());
        System.out.println(obj.getId());
        
        obj.setPriority(MAX_PRIORITY);


        System.out.println(obj.getPriority());
        System.out.println(obj.isAlive());
    }
}
