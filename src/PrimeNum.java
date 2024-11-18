public class PrimeNum {
    public static void main(String[] args) {
        int primrTill = 100;
        for(int i=0; i<primrTill; i++){
            if(printPrime(i)){
                System.out.print(i + " ");
            }
        }
    }
    static boolean printPrime(int n){
        if(n==1 || n==0){
            return false;
        }

        for(int i =2; i<n; i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
}
