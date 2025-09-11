public class Main {
    public static void main(String[] args) {
        System.out.println("That is the screen match");

        int year = 2023;

        boolean included = true;

        double rating = 10;

        double average  = (4.8 + 3.9 + 4.5)/3; 

        System.out.printf("included: %b, rating: %f, average: %f, year: %d", included, rating, average, year);

        int averageToInt = (int) average;
        System.out.printf("\naverage to int: %d", averageToInt);
    }
}