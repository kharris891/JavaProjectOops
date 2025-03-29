public class Task7 {

}

class NumberOfWords {

    public static int words(String word){
            return word.trim().split("\\s+").length;

    }
    public static void main(String[] args) {
        System.out.println(words("my name is wasim"));

    }
}
