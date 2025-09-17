
import java.util.Scanner;

public class Fibonnaci {
    private static long GetFibonnaciElement(int position) {
        if (position == 0 || position == 1) {
            return position;
        } 
        return  GetFibonnaciElement(position - 1 ) + GetFibonnaciElement(position - 2);
       
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("get fibonnaci element");
        System.out.println(GetFibonnaciElement(scanner.nextInt()));
    }
}