
import java.util.Scanner;
public class Arraypractice {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter rows: ");
        int rows = in.nextInt();
        System.out.print("Enter column: ");
        int column = in.nextInt();

        // creating a 2D Array
        int[][] matrix = new int[rows][column];

        //Array input
        for(int i=0; i<rows; i++){
            for(int j=0; j<column; j++){
                matrix[i][j] = in.nextInt();
            }
        }

        //output
        for(int i=0; i<rows; i++){
            for(int j=0; j<column; j++){
                System.out.print(matrix[i][j]+ " ");
            }
            System.out.println();
        }



    }

}
