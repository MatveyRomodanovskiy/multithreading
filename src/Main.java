//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws InterruptedException {
        Grain gr=new Grain("Grain");
        Thread t = new Thread(new HelloThread("First", gr));
        Thread t2 = new Thread(new HelloThread("Second", gr));
        Thread t3 = new Thread(new HelloThread("Third", gr));
            t.start(); // запускаем поток
            t2.start();
            t3.start();
            t.join();
            t2.join();
            t3.join();
            System.out.println("Main thread finished start()");

    }

}