import java.util.Scanner;
public class Method3 {
   public static int productTwoNumbers(int number1, int number2){

       return number1*number2;

   }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter First Number:");
        int number1 = in.nextInt();
        System.out.println("Enter Second Number:");
        int number2 = in.nextInt();


        System.out.println(productTwoNumbers(number1, number2));


    }
}
