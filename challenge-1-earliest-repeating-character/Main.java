import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        // Input string
        String s = "geeksforgeeks";

        // Call function 
        System.out.println(findFirstRepeating(s));
    }

    public static char findFirstRepeating(String s) {

        // HashSet to store characters we have already seen
        HashSet<Character> seen = new HashSet<>();

        // Loop through each character in the string
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            // If character already exists in set → it's repeating
            if (seen.contains(ch)) {
                return ch;
            }

            seen.add(ch);
        }

        // If no repeating character found, return null character
        return '\0';
    }
}