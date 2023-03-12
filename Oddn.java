
import java.util.Scanner;
    public class Oddn {
        public static void Circle(double a) {

            double c=Math.PI*a;
            System.out.println("circle of area is="+c);

        }
        public static void Rectangle(double a,double b) {
            double r=a*b;
            System.out.println("area is="+r);
        }

        //public static void Triangle(double a,double b,double c) {
        // if(a+b>c)
        //{
        //double s=(a+b+c)/3;
        //}
        // double t=Math.sqrt(s*(s-a)*(s-b)*(s-c));
        // System.out.println();
        //}
        public static void main(String[] args) {
            Scanner in=new Scanner(System.in);

            System.out.println("enter p");
            int p=in.nextInt();

            if(  p==1) {
                System.out.println("enter a");
                double a=in.nextDouble();
                Circle(a);
            }
            else if (p==2) {

                System.out.println("enter b");
                double b=in.nextDouble();
                System.out.println("enter a");
                double a=in.nextDouble();
                Rectangle(a,b);
            }
            else if(p==3)
            {
                System.out.println("enter a");
                double a=in.nextDouble();
                System.out.println("enter b");
                double b=in.nextDouble();
                System.out.println("enter c");
                double c=in.nextDouble();
                //Triangle(a,b,c);
            }
            else
                System.out.println("invalid");
        }

    }



