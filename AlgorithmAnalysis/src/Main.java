public class Main {

    public static void main(String[] args) {
        int num = 4029129;
        generatePrimeNumbers();
    }

    public static boolean binarySearch(int[] arr, int n) {
        int low = 0;
        int high = arr.length;

        while(high >= low) {
            int mid = (high + low) / 2;
            if (n == arr[mid]) {
                return true;
            } else if (n < arr[mid]) {
                high = mid - 1;
            } else {
                high = mid + 1;
            }
        }
        return false;
    }

    public static boolean isPrime(int n, String mode) {
        if (mode.equalsIgnoreCase("O(sqrt(n))")) {
            //System.out.println("Running prime check with O(sqrt(n)) run time.");
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    return false;
                }
            }
        } else {
            System.out.println("Running prime check with O(n) run time.");
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void generatePrimeNumbers() {
        int i = 0;
        while(true) {
            if (isPrime(i, "O(sqrt(n))")) {
                System.out.println(i + " is prime");
            }
            i++;
        }
    }
}
