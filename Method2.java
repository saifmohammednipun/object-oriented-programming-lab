import java.util.Scanner;
public class Method2 {
    public static int sumTwoNumbers(int number1, int number2){
        int sum=0;
        sum=number1+number2;
        return sum;

    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter First Number:");
        int number1 = in.nextInt();
        System.out.println("Enter Second Number:");
        int number2 = in.nextInt();

        int sum=0;
        sum = sumTwoNumbers(number1, number2);
        System.out.println(sum);

    }
}
