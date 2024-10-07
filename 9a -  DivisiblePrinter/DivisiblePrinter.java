package DivisiblePrinter;

class DivisiblePrinter {

    public synchronized void printTwo(int n) {
        if (n % 2 == 0) {
            System.out.println("Number " + n + " is divisible by 2");
        }
    }

    public synchronized void printThree(int n) {
        if (n % 3 == 0) {
            System.out.println("Number " + n + " is divisible by 3");
        }
    }

    public synchronized void printFour(int n) {
        if (n % 4 == 0) {
            System.out.println("Number " + n + " is divisible by 4");
        }
    }

    public synchronized void printFive(int n) {
        if (n % 5 == 0) {
            System.out.println("Number " + n + " is divisible by 5");
        }
    }

    public synchronized void printNumber(int n) {
        if (n % 2 != 0 && n % 3 != 0 && n % 4 != 0 && n % 5 != 0) {
            System.out.println("Number " + n + " is not divisible by 2, 3, 4, or 5");
        }
    }
}
