import java.util.Locale;
import java.util.Scanner;
public class Reading {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);
        System.out.println("type your favorite movie");
        String movie = scanner.nextLine();
        System.out.println("in what year was the movie released?");
        int releasedYear = scanner.nextInt();
        System.out.println("type your film rating");
        double rating = scanner.nextDouble();
        System.out.printf("year that the movie was released: %d. movie rating: %f. movie's name: %s", releasedYear, rating, movie);
    }
}
