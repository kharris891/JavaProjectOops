public class Task6 {
}

class VowelCount {

    public static void main(String[] args) {
        String word = "documentation";
        int vowelCount = vowels(word);
        System.out.println("Word: " + word + "\nNumber of vowels: " + vowelCount);
    }

    public static int vowels(String input) {
        int count = 0;
        String vowels = "AEIOUaeiou";
        for (int i = 0; i < input.length(); i++) {
            if (vowels.indexOf(input.charAt(i)) != -1) {
                count++;
            }
        }
        return count;
    }
}