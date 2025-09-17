public class SumElementsInAInt {
    private static int SumElements(int number) {
        String numberString = Integer.toString(number);
        if (numberString.length() <= 1) {
            return number;
        }
        Integer firstNumberInt = Character.getNumericValue(numberString.charAt(0));
        Integer nextNumber = Integer.valueOf(numberString.substring(1));
        return firstNumberInt += SumElements(nextNumber);
    }
    public static void main(String[] args) {
        System.out.println(SumElements(432));
    }
}
