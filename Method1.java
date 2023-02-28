import java.util.Scanner;
public class Method1 {

    public static void printMyName(String name){

        System.out.println(name);

    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name =in.nextLine();

        printMyName(name);



    }
}
