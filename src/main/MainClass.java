package main;

public class MainClass {

    public static void main(String[] args) {
        Cyclist cyclist = new Cyclist();
        MyPanel panel = new MyPanel(cyclist);
        @SuppressWarnings("unused")
        MyFrame frame = new MyFrame(panel);

        for(int i=0; i<10; i++) {
            Thread thread = new Thread(new MyThread(cyclist, panel));
            thread.start();
            try {
                thread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
