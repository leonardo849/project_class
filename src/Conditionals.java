public class Conditionals {
    public static void main(String[] args) {
        int year = 2023;

        boolean included = true;

        double rating = 10;

        String sortPlan = "plus";


        if (year > 2023) {
            System.out.println("new movies");
        } else {
            System.out.println("old movie");
        }

        if (included && sortPlan.equals("plus")) {
            System.out.println("you can movie watch the movie without paying");
        } else {
            System.out.println("you have to pay for watch the movie");
        }
    }
}
