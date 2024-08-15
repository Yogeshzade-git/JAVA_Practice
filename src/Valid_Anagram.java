import java.util.Arrays;

// An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase,
// typically using all the original letters exactly once.
public class Valid_Anagram {

    public static boolean isAnagram(String s, String t) {

        s =s.toLowerCase();
        t =t.toLowerCase();


            if (s.length() != t.length()) {
                return false;
            } else {

                char arr1[] = s.toCharArray();
                char arr2[] = t.toCharArray();

                Arrays.sort(arr1);
                Arrays.sort(arr2);

                return Arrays.equals(arr1, arr2);

            }

        }

    public static void main(String[] args) {
        System.out.println("Is Anagram : " + isAnagram("cat", "act"));
    }
}
