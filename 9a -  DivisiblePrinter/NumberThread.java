package DivisiblePrinter;

class NumberThread implements Runnable {
    private DivisiblePrinter printer;
    private int number;

    public NumberThread(DivisiblePrinter printer, int number) {
        this.printer = printer;
        this.number = number;
    }

    
    public void run() {
        printer.printTwo(number);
        printer.printThree(number);
        printer.printFour(number);
        printer.printFive(number);
        printer.printNumber(number);
    }
}