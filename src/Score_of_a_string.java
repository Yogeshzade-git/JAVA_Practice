
import java.lang.*;
public class Score_of_a_string {


    static int answer(String word){
        int score = 0;

        for(int i=1; i<word.length(); i++){
            int diff = word.charAt(i) - word.charAt(i-1);
            score =+ Math.abs(diff);
        }

        return score;
    }
    public static void main(String[] args) {
        System.out.println(answer("Hello"));
    }
}
