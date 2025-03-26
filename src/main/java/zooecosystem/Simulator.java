package zooecosystem;

public class Simulator {
    public static void main(String[] args) {
        Animal lion1 = new Lion("Courage", 8);
        Animal elephant1 = new Elephant("Dumbo", 34);
        Animal parrot1 = new Parrot("Polly", 12);
        Animal eagle1 = new Eagle("Rooster", 5);


        lion1.displayInformation();
        lion1.sleep();
        System.out.println();
        elephant1.displayInformation();
        elephant1.sleep();
        System.out.println();
        parrot1.displayInformation();
        parrot1.sleep();
        System.out.println();
        eagle1.displayInformation();
        eagle1.sleep();
        System.out.println();

        Registration user1 = new Registration();
        user1.setEmail("zoofanatic@yahoo.com");
        user1.setUserName("ZooFanatic");
        user1.setPassword("123456789");
        user1.userInformation();
    }
}
