import java.util.Scanner;
public class Task1 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int[] number = new int[6];
        System.out.print("Enter Numbers: ");

        for(int i=0; i<6; i++){
            number[i]= in.nextInt();
        }

        double sum =0.0;
        double avg =0.0;

        for(int i=0; i<6; i++){
            sum = sum + number[i];
        }

        System.out.println("Average: " + (avg = sum/6));

        int count=0;

        System.out.print("Elements that are above average: ");

for(int i=0; i<6; i++) {
    if (number[i] > avg) {
        count++;
        System.out.print( number[i] + " ");

    }
}
        System.out.println();
        int percentage = (count * 100)/6;
    System.out.println("Percentage: " + percentage+"%");






    }
}
