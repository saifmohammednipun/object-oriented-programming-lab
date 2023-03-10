
public class ReverseString {
    public static void main(String[] args) {
        String s1="Tutor Joes Computer Education";

        int c=s1.indexOf("Computer");
        System.out.println(c);

        for(int i=s1.length()-1; i>=0; i--){
            System.out.print(s1.charAt(i));
        }




    }
}
