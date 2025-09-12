import java.util.Scanner;


public class Challenge {
    private static  long calculateFactorial(int n) {
        long result = 1;
        for (int i = 1; i<=n; i++) {
            result *= i;
        }
        return  result;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("type a int. I will calculate its factorial");
        int n = scanner.nextInt();
        long result = calculateFactorial(n);
        System.out.printf("%d factorial is %d", n, result);

    }
}
