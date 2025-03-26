package zooecosystem;

abstract class Mammal extends Animal {
    public Mammal(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println();
    }

    @Override
    public void makesound() {

    }

    @Override
    public void displayInformation() {

    }
}

class Lion extends Mammal {
    public Lion(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println(name + " eats meat.");
    }

    @Override
    public void makesound() {
        System.out.println(name + " roars.");
    }

    @Override
    public void displayInformation() {
        System.out.println("Lion: " + name + ", Age: " + age);
        eat();
        makesound();
    }
}

class Elephant extends Mammal {
    public Elephant(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println(name + " eats leaves and grasses.");

    }

    @Override
    public void makesound() {
        System.out.println(name + " trumpets.");
    }

    @Override
    public void displayInformation() {
        System.out.println("Elephant: " + name + ", Age: " + age);
        eat();
        makesound();
    }
}