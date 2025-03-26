package zooecosystem;

public abstract class Animal implements AnimalBehavior {
    String name;
    int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public void sleep() {
        System.out.println(name + " sleeps.");
    }

    public abstract void displayInformation();
}
