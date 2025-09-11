
import java.util.Locale;
import java.util.Scanner;

public class Loop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);
        double rating = 0;
        for (int i = 0; i< 3; i++) {
            System.err.println("type your movie rating");
            rating += scanner.nextDouble();
        }
        double averageRating = rating / 3;
        System.out.printf("average rating: %f", averageRating);
    }
}
