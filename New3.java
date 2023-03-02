import java.util.Scanner;
public class New3 {
    static double balance = 0.0;

    public static double deposit(double amount) {
        balance = balance + amount;
        return balance;

    }

    public static double withdraw(double amount) {
        balance = balance - amount;
        return balance;

    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);


        for (int i = 1; ; i++) {
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Balance");
            System.out.println("4. Exit");

            System.out.println("Enter your choice: ");
            int choice = in.nextInt();

            switch (choice) {
                case 1: {
                    System.out.println("Enter deposit amount: ");
                    double amount = in.nextDouble();
                    deposit(amount);
                    System.out.println("Amount successfully deposit.");

                }
                break;
                case 2: {
                    System.out.println("Enter withdraw amount: ");
                    double amount = in.nextDouble();
                    if (amount > balance) {
                        System.out.println("You do not have sufficient Balance.");
                    } else {
                        withdraw(amount);
                        System.out.println("Amount successfully withdrawn.");
                    }
                    break;
                }
                case 3:
                    System.out.println(balance);
                    break;
                case 4:
                {
                    System.out.println("System Successfully exited.");
                    System.exit(0);
                }
                    break;

                default :
                    System.out.println("Invalid choice");


                }
            }

        }
    }

