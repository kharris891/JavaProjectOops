package zooecosystem;

public abstract class Bird extends Animal {
    public Bird(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {

    }

    @Override
    public void makesound() {

    }

    @Override
    public void displayInformation() {

    }
}

class Parrot extends Bird {
    public Parrot(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println(name + " eats fruit and nuts.");
    }

    @Override
    public void makesound() {
        System.out.println(name + " squawks.");
    }

    @Override
    public void displayInformation() {
        System.out.println("Parrot: " + name + ", Age: " + age);
        eat();
        makesound();
    }
}

class Eagle extends Bird {
    public Eagle(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println(name + " eats fish.");
    }

    @Override
    public void makesound() {
        System.out.println(name + " screeches.");
    }

    @Override
    public void displayInformation() {
        System.out.println("Eagle: " + name + ", Age: " + age);
        eat();
        makesound();
    }
}