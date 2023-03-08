import java.util.Scanner;
public class AssignmentProblem4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the language code (unicode) for the language you want to display:");
        System.out.println("Bengali - 09e6");
        System.out.println("Chinese - 0627");
        System.out.println("Greek   - 0e01");
        System.out.println("Hindi   - 4e00");
        System.out.println("Russian - 0c95");

        String unicode= in.next();

        switch(unicode) {
            case "09e6": System.out.println("Bengali: "+'\u09A6');break;
            case "0627": System.out.println("Chinese: "+'\u4E2D');break;
            case "0e01": System.out.println("Greek: "  +'\u0393');break;
            case "4e00": System.out.println("Hindi: "  +'\u0939');break;
            case "0c95": System.out.println("Russian: "+'\u0440');break;
            default: System.out.println("invalid unicode.");
        }
    }
}