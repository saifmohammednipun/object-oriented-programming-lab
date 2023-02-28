import java.util.Scanner;
public class Task4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter size: ");
        int size = in.nextInt();

        int numbers[] = new int[size];


        for (int i = 0; i < size; i++) {
            numbers[i] = in.nextInt();

        }

        for (int i = 0; i < size - 2; i++) {

                if (numbers[i] + 1 == numbers[i + 1] && numbers[i + 1] + 1 == numbers[i + 2]) {
                    System.out.print(numbers[i+1] + " "+ numbers[i+2]);
                }
            }

        }
    }

