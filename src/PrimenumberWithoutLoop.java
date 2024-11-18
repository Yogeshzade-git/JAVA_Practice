public class PrimenumberWithoutLoop {
    public static void main(String[] args) {
       int last = 100;
        primenum(1, last);
    }

    public static void primenum(int initial, int last){
        if(initial <= last) {
            System.out.println(initial + " ");
            primenum(initial + 1, last);
        }
        return;
    }
}
