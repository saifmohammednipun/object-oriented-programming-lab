
import java.util.Scanner;
public class Extract {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the dollar amount: ");
        String dollar= in.nextLine();

        System.out.println( dollar.substring(0, dollar.indexOf('.')));

        System.out.println(Integer.parseInt(dollar.substring(dollar.indexOf('.')+1)));
    }
}
