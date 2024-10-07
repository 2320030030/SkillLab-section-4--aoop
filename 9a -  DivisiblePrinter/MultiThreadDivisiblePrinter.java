package DivisiblePrinter;

public class MultiThreadDivisiblePrinter {

    public static void main(String[] args) {
        DivisiblePrinter printer = new DivisiblePrinter();

        for (int i = 1; i <= 15; i++) {
            Thread t = new Thread(new NumberThread(printer, i));
            t.start();

            try {
                t.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}