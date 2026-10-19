class Vehicle {
    void start() {
        System.out.println("Vehicle starts");
    }
}

// Single inheritance
class Car extends Vehicle {
    void drive() {
        System.out.println("Car is driving");
    }
}

// Multilevel inheritance
class Person {
    void showPerson() {
        System.out.println("This is a person");
    }
}

class Employee extends Person {
    void showEmployee() {
        System.out.println("This is an employee");
    }
}

class Manager extends Employee {
    void showManager() {
        System.out.println("This is a manager");
    }
}

// Hierarchical inheritance
class Shape {
    void display() {
        System.out.println("This is a shape");
    }
}

class Circle extends Shape {
    void drawCircle() {
        System.out.println("Drawing a circle");
    }
}

class Rectangle extends Shape {
    void drawRectangle() {
        System.out.println("Drawing a rectangle");
    }
}

public class InheritanceDemo {
    public static void main(String[] args) {
        Car c = new Car();
        c.start();
        c.drive();

        Manager m = new Manager();
        m.showPerson();
        m.showEmployee();
        m.showManager();

        Circle ci = new Circle();
        ci.display();
        ci.drawCircle();

        Rectangle r = new Rectangle();
        r.display();
        r.drawRectangle();
    }
}
