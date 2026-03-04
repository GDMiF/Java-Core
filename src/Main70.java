public class Main70 {
    public static void main(String[] args) {

        Thread thread1 = new Thread(new MyLessoning("Ping"));
        Thread thread2 = new Thread(new MyLessoning("Pong"));

        System.out.println("GAME START!");

        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            System.out.println("Main thread was interrupted");
        }

        System.out.println("GAME OVER!");

    }
}
