import java.util.Scanner;
public class Array4 {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);

        System.out.println("Enter size: ");
        int size = in.nextInt();

        int[] array = new int[size];
        for(int i =0; i<size; i++){
            array[i]= in.nextInt();
        }

        for(int i=0; i<size; i++){
            if(array[i]+1 == array[i+1] || array[i]+2 == array[i+2]){
                System.out.println(array[i]+ " ");

                }
            }
        }

    }

