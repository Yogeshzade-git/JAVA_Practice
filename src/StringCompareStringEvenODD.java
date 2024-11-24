public class StringCompareStringEvenODD {
    public static void main(String[] args) {
        System.out.println(isoddEven("hello my name is yogesh", "hello my name is yogesh zade"));
    }

    public static String isoddEven(String str1, String str2){
        int count_str1=0;
        int count_str2=0;

        for(char ch  : str1.toCharArray()){
            if(ch == ' '){
                count_str1++;
            }
        }

        for(char ch  : str2.toCharArray()){
            if(ch == ' '){
                count_str2++;
            }
        }

        int absoluteNum = count_str1 - count_str2;

        if(absoluteNum < 0)
            absoluteNum = -absoluteNum;

        if(absoluteNum % 2 == 0) {
            return "Even" + absoluteNum;
        }else{
            return "Odd"+absoluteNum;
        }
    }
}
