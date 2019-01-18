package PrimeCheckerCode;

public class PrimeChecker {

    public boolean checkPrime(int n) {
        if(n <= 1) return false;
        for(int i = 2; i <n; i++){
            if(n%2==0){
                return false;
            }
        }
        return true;
    }
}
