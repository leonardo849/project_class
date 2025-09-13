
import java.util.Scanner;

public class Banking {
    private static double bankBalance;
    private static Scanner scanner;
    public static void main(String[] args) {
        scanner = new Scanner(System.in);
        while (true) { 
            System.out.println("1 transfer, 2 add money, 3 get bank balance, 4 exit");
            int option = scanner.nextInt();
            switch (option) {
                case 1:
                    Transfer();
                    break;
                case 2:
                    AddMoney();
                    break;
                case 3: 
                    double amount = GetBankBalance();
                    System.out.printf("amount: %f \n", amount);
                    break;
                case 4:
                    return;
                default:
                    System.out.println("what a fuck are you doing?");
            }
        }
    }
    private  static void Transfer()  {
        System.out.println("type the amount");
        double amount = scanner.nextInt();
        if (amount > bankBalance) {
            System.out.println("the money wasn't sent");
        } else {
            bankBalance -= amount;
            System.out.println("the money was sent");
        }
    }
    private  static void AddMoney() {
        System.out.println("type the amount");
        double amount = scanner.nextInt();
        bankBalance += amount;
        System.out.println("money was added");
    }
    private  static double GetBankBalance() {
        return  bankBalance;
    }
}
