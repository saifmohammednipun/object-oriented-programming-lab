import java.sql.SQLOutput;
import java.util.Scanner;
public class DaysOfAMonth {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);

        System.out.println("Enter a year: ");
        int year = in.nextInt();
        in.nextLine();
        System.out.println("Enter a month: ");
        String month = in.nextLine();

        boolean b= ((year%4==0 && year%100 !=0) || (year%400==0));


        if(b==false){
       // Jan 2001 has 31 days
            if(month.equals("Jan") || month.equals("Mar") || month.equals("May") || month.equals("Jul")||month.equals("Aug")||month.equals("Oct")|| month.equals("Dec"))
             {
            System.out.print("31 days");
              }
        else if (month.equals("Apr") || month.equals("Jun") || month.equals("Sep")||month.equals("Nov")){

            System.out.print("30 days");
        }
        else {
                System.out.print("28 days");
            }
        }

        else{

            System.out.print("29 days");

        }

    }
}
