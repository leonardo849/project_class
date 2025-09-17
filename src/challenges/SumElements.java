public class SumElements {
    private  static long AddElementsUpToN(int number) {
        if (number <= 1) {
            return  1;
        }
        return  number += AddElementsUpToN(number - 1);

    }
    public static void main(String[] args) {
        System.out.println(AddElementsUpToN(10));
    }
}
