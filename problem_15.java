import java.util.concurrent.TimeUnit;

class GoodMorningThread extends Thread {

    @Override
    public void run() {
        while (true) {
            System.out.println("Good Morning");
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class HelloThread extends Thread {

    @Override
    public void run() {
        while (true) {
            System.out.println("Hello");
            try {
                TimeUnit.SECONDS.sleep(2);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class WelcomeThread extends Thread {

    @Override
    public void run() {
        while (true) {
            System.out.println("Welcome");
            try {
                TimeUnit.SECONDS.sleep(3);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class problem_15 {

    public static void main(String[] args) {
        GoodMorningThread goodMorningThread = new GoodMorningThread();
        HelloThread helloThread = new HelloThread();
        WelcomeThread welcomeThread = new WelcomeThread();

        goodMorningThread.start();
        helloThread.start();
        welcomeThread.start();
    }
}
