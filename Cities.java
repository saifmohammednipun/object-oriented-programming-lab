import java.util.Scanner;
public class Cities {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter First cities: ");
        String city1 =in.nextLine();
        System.out.println("Enter Second cities: ");
        String city2 =in.nextLine();
        System.out.println("Enter Third cities: ");
        String city3 =in.nextLine();
        String temp;
         if(city1.compareTo(city2)<0 && (city2.compareTo(city3)<0))
         {
             System.out.println(city1 +" "+ city2+ " "+ city3);
         }
         else if(city2.compareTo(city1)<0 && (city1.compareTo(city3)<0)){

         }

         else{
             System.out.println(city3 +" "+ city2+ " "+ city1);

         }



    }
}
