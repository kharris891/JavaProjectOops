public class Task2 {
}

class CountingAlphaCharacters {
    public static int countAlpha(String str) {
        int count = 0;
        if (str != null) {
            for (int i = 0; i < str.length(); i++) {
                if (Character.isLetter(str.charAt(i))) {
                    count++;
                }
            }
        }
        return count;
    }
    public static void main(String [] args){
        String mystring="Syntax is good 2025";
        int alphacount= countAlpha(mystring);
        System.out.println("Alpha characters in the string is:" + " "+ alphacount);
    }
}
