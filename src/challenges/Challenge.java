import java.util.Scanner;


public class Challenge {
    private static  long calculateFactorial(int n) {
        if (n == 1 || n == 0) {
            return 1;
        }
        return  n * calculateFactorial(n - 1); 
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("type a int. I will calculate its factorial");
        int n = scanner.nextInt();
        long result = calculateFactorial(n);
        System.out.printf("%d factorial is %d", n, result);

    }
}
