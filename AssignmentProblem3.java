import java.util.Scanner;
public class AssignmentProblem3 {

        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.print("Enter the temperature in Fahrenheit (degrees): ");
            double fahrenheit=input.nextDouble();
            System.out.print("Enter the relative humidity (percentage): ");
            double humidity=input.nextDouble();
            System.out.print("Enter the wind-speed in miles per hour (greater than or equal to 2): ");
            double wind=input.nextDouble();

            double V=Math.pow(wind,0.16);
            double Tf=35.74+0.6215*fahrenheit-35.75*V+0.4275*fahrenheit*V;
            double ComfortIndex=-42.379+2.04901523*Tf+10.14333127*humidity-0.22475541*Tf*humidity-6.83783e-3*Math.pow(Tf,2)-5.481717e-2*Math.pow(humidity,2)+1.22874e-3*Math.pow(Tf,2)*humidity+8.5282e-4*Tf*Math.pow(humidity,2)-1.99e-6*Math.pow(Tf, 2)*Math.pow(humidity,2);

            System.out.printf("The comfort index is: %.2f",ComfortIndex);

        }
}


