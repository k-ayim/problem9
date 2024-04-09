import java.util.Scanner;

public class Problem9BinomialCoefficientRecursive {

    /**
     * Finds the binomial coefficient C(n, k) using recursion.
     * 
     * @param n The total number of elements
     * @param k The number of elements to choose
     * @return The binomial coefficient C(n, k)
     */
    public static int binomialCoefficient(int n, int k) {
        if (k == 0 || k == n) {
            return 1; // Base case: C(n, 0) = C(n, n) = 1
        } else {
            return binomialCoefficient(n - 1, k - 1) + binomialCoefficient(n - 1, k);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the value of n: ");
        int n = scanner.nextInt();

        System.out.print("Enter the value of k: ");
        int k = scanner.nextInt();

        int result = binomialCoefficient(n, k);
        System.out.println("C(" + n + ", " + k + ") = " + result);

        scanner.close();
    }
}




