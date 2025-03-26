public class Task4 {
    public static void main(String[] args) {

        String phrase="noon";
        checkPalindrome(phrase);
        System.out.println();
        String phrase2="Planet";
        checkPalindrome(phrase2);
        System.out.println();

    }

    private static void checkPalindrome(String phrase) {
        System.out.println("Original: " + phrase);



        StringBuilder reversePhrase=new StringBuilder(phrase).reverse();
        System.out.println("Reversed phrase: " + reversePhrase);

        boolean isPalindrome=phrase.toString().equals(reversePhrase.toString());
        System.out.println("\"" + phrase + "\" " + (isPalindrome ? "is a palindrome." : "is not a palindrome."));


    }
}
