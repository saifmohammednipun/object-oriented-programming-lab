import java.util.Scanner;
public class Task3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter rows: ");
        int rows = in.nextInt();

        System.out.print("Enter columns: ");
        int columns = in.nextInt();

        int[][] matrix =new int[rows][columns];

        for(int i=0; i<rows; i++){
            for(int j =0; j<columns; j++){
                matrix[i][j]=in.nextInt();
            }

        }
// sum of each row
        System.out.println("Sum of Rows: ");
        int sum1 =0;

        for(int j=0; j<columns; j++){
            sum1= sum1+ matrix[0][j];
        }
        System.out.println(sum1);

        int sum2=0;

        for(int j=0; j<columns; j++){
            sum2= sum2 + matrix[1][j];
        }
        System.out.println(sum2);

        int sum3 =0;

        for(int j=0; j<columns; j++){
            sum3= sum3+ matrix[2][j];
        }
        System.out.println(sum3);

        // sum of each column
        System.out.println("Sum of column");
        int sumcol1 =0;

        for(int i=0; i<rows; i++){
            sumcol1= sumcol1+ matrix[i][0];
        }
        System.out.println(sumcol1);

        int sumcol2 =0;

        for(int i=0; i<rows; i++){
            sumcol2= sumcol2+ matrix[i][1];
        }
        System.out.println(sumcol2);

        int sumcol3 =0;

        for(int i=0; i<rows; i++){
            sumcol3= sumcol3+ matrix[i][2];
        }
        System.out.println(sumcol3);

        // sum of diagonals
        System.out.println("Sum of both diagonals");

        int sumdiagonal=0;

        for(int i=0; i<rows; i++){
            for(int j =0; j<columns; j++){
                if(i==j){
                    sumdiagonal = sumdiagonal + matrix[i][j] ;

                }


            }
        }
        System.out.println(sumdiagonal);

        int sumdia2=0;

        for(int i=0; i<rows; i++){
            for(int j =0; j<columns; j++){
                if(i+j==rows-1)
                sumdia2 = sumdia2 + matrix[i][j];

            }
        }
        System.out.println(sumdia2);



    }
}
