import java.sql.SQLOutput;

public class Check_Palindrome {

    static boolean checkPalindrome(String word) {
        boolean isPalindrome = true;
        word = word.replaceAll("\\s+", "").replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        int left = 0;
        int right = word.length() - 1;

        while(left < right){
            if (word.charAt(left) == word.charAt(right)){
                left++;
                right--;
            }else{
                isPalindrome = false;
                break;
            }
        }

        if(isPalindrome){
            return true;
        }else {
            return false;
        }
    }
    public static void main(String[] args) {
        System.out.println("IS String Palindrome: " + checkPalindrome("A man a plan a canal Panama") );
    }
}
