public class ThreadExample {

    public static void main(String[] args) {
        // Create and start a new thread using Thread class
        Thread thread1 = new MyThread("Thread 1");
        thread1.start();

        // Create and start a new thread using Runnable interface
        Thread thread2 = new Thread(new MyRunnable("Thread 2"));
        thread2.start();
    }
}

class MyThread extends Thread {
    private String name;

    public MyThread(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        System.out.println("Thread " + name + " is running");
    }
}

class MyRunnable implements Runnable {
    private String name;

    public MyRunnable(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        System.out.println("Thread " + name + " is running");
    }
}
