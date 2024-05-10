public class threadSleep extends Thread {

    public void run() {
        for (int i = 0; i <= 10; i++) {
            try {
                Thread.sleep(600);
            } catch (Exception e) {
                System.out.println(e);
            }
            System.out.println(i);

        }
    }

    public static void main(String[] args) {
        threadSleep obj = new threadSleep();
        threadSleep obj1 = new threadSleep();
        obj.start();
        obj1.start();

    }

}
