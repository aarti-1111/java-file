class Calculator {
    // Method overloading
    int add(int a, int b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }

    double add(double a, double b) {
        return a + b;
    }
}

class Payment {
    void calculatePay() {
        System.out.println("General payment calculation");
    }
}

class SalaryPayment extends Payment {
    @Override
    void calculatePay() {
        System.out.println("Salary payment calculated");
    }
}

class BonusPayment extends Payment {
    @Override
    void calculatePay() {
        System.out.println("Bonus payment calculated");
    }
}

public class PolymorphismDemo {
    public static void main(String[] args) {
        Calculator c = new Calculator();

        System.out.println("Sum of 2 numbers: " + c.add(10, 20));
        System.out.println("Sum of 3 numbers: " + c.add(10, 20, 30));
        System.out.println("Sum of decimal numbers: " + c.add(2.5, 3.5));

        Payment p;

        p = new SalaryPayment();
        p.calculatePay();

        p = new BonusPayment();
        p.calculatePay();
    }
}
