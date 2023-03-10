import java.util.Scanner;
public class HexagonArea {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the side: ");
        double s= in.nextDouble();

        double area = 6*Math.pow(s,2)/(4* Math.tan(Math.PI/6));

        System.out.printf("The area of the hexagon is: %.2f",area);

    }
}
