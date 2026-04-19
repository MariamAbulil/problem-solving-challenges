import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        String s = "geeksforgeeks";
        System.out.println(findFirstRepeating(s));
    }

    public static char findFirstRepeating(String s) {
        HashSet<Character> seen = new HashSet<>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (seen.contains(ch)) {
                return ch; 
            }

            seen.add(ch);
        }

        return '\0';
    }
}