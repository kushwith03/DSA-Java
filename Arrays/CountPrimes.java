package Arrays;

public class CountPrimes {
    public static boolean isPrime(int number) {
        if (number <= 1) return false;
        for (int i = 2; i * i <= number; i++) {
            if (number % i == 0) return false;
        }
        return true;
    }

    public static int bruteForce(int n) {
        if (n <= 2) return 0;
        int count = 0;
        for (int i = 2; i < n; i++) {
            if (isPrime(i)) count++;
        }
        return count;
    }

    public static int countPrimes(int n) {
        //Sieve of Eratosthenes
        if (n <= 2) return 0;
        boolean[] isPrime = new boolean[n];
        for (int i = 2; i < n; i++) {
            isPrime[i] = true;
        }
        for (int i = 2; i * i < n; i++) {
            if (isPrime[i]) {
                for (int j = i * i; j < n; j += i) {
                    isPrime[j] = false;
                }
            }
        }
        int count = 0;
        for (boolean prime : isPrime) {
            if (prime) count++;
        }
        return count;
    }
}
