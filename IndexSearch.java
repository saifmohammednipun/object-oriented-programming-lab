import java.util.Scanner;
public class IndexSearch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter rows:");
        int rows = in.nextInt();

        System.out.print("Enter colum:");
        int columns = in.nextInt();

        int matrix[][] = new int[rows][columns];

        for(int i=0; i<rows; i++){
            for(int j=0; j<columns; j++) {
                matrix[i][j] = in.nextInt();
            }
        }

        int x=5;

        for(int i=0; i<rows; i++){
            for(int j=0; j<columns;j++){
                    if(matrix[i][j]==x){
                        System.out.println("Index ("+ i+ "," + j+ ")");
                    }
            }
        }

    }
}
