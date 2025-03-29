public class Task8 {
}


class AStrings {
    public static void main(String[] args) {

        String[] list = {"Altoids", "Brave", "Adult", "Deer", "Chip", "Adriana"};

        for (String AWord : list) {
            if (AWord.contains("A")) {
                System.out.println(AWord.toLowerCase());
            }

        }
    }
}
