public class Main {
    public static void main(String[] args) {
        String s = "cat";
        String t = "tac";

        System.out.println(isAnagram(s, t));
    }

    public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        int[] charCount = new int[128];

        for (int i = 0; i < s.length(); i++) {
            charCount[s.charAt(i)]++;
            charCount[t.charAt(i)]--;
        }

        for (int count : charCount) {
            if (count != 0) {
                return false;
            }
        }

        return true;
    }
}