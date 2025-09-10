import java.util.Random;

public class HelloThread implements Runnable {
String name;
static int capacity = 0;
Grain gr;

    public HelloThread(String name, Grain g) {
        this.name = name;
        this.gr = g;
    }


    @Override
    public void run() {
        for (int i = 1; i <= 1000000; i++) {
            capacity++;
            gr.setMass();
            try {
                Thread.sleep(0); // делаем паузу
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(capacity + name + gr.getMass());
    }

}