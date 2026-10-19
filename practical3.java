interface Printable {
    void print();
}

interface Scannable {
    void scan();
}

class AllInOnePrinter implements Printable, Scannable {
    public void print() {
        System.out.println("Printing document");
    }

    public void scan() {
        System.out.println("Scanning document");
    }
}

// Hybrid inheritance example
class Machine {
    void powerOn() {
        System.out.println("Machine is ON");
    }
}

class Computer extends Machine {
    void process() {
        System.out.println("Computer is processing");
    }
}

class SmartComputer extends Computer implements Printable {
    public void print() {
        System.out.println("Smart computer is printing");
    }
}

public class InterfaceDemo {
    public static void main(String[] args) {
        AllInOnePrinter p = new AllInOnePrinter();
        p.print();
        p.scan();

        SmartComputer s = new SmartComputer();
        s.powerOn();
        s.process();
        s.print();
    }
}
