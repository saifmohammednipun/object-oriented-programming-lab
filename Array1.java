import java.util.Scanner;
public class Array1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int size=6;

        int[] arr= new int[size];

        for(int i =0; i<size; i++) {
            arr[i]=in.nextInt();
        }

        int sum =0;
        double average=0.0;
        for(int i =0; i<size; i++) {
          sum = sum+ arr[i];
          average=sum/size;
        }

        System.out.println(average);

        int count=0;
        for(int i =0; i<size; i++) {
            if(arr[i]>average){
                count++;
            }
        }
        int percentage=0;

        percentage = (count*100)/size;
        System.out.println(percentage+ "%");




    }
}
