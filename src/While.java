import java.util.Locale;
import java.util.Scanner;

public class While {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);
        double rating = 0;
        double sumRating = 0;
        int quantityOfRating = 0;
        while (true) {
            System.out.println("type your movie rating");
            rating = scanner.nextDouble();
            if (rating == -1) {
                break;
            }
            sumRating += rating;
            quantityOfRating++;
        }

        double averageRating = sumRating / quantityOfRating;
        System.out.printf("average rating: %f", averageRating);
    }
}
