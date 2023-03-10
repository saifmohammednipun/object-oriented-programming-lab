public class PlateNumbers {
    public static void main(String[] args) {


        for(int i=0; i<3; i++)
        {
             int s =  (65 + (int) (Math.random() * (91-65)));
            System.out.print((char)s);
        }
        System.out.print("-");

        for(int i=0; i<4; i++)
        {
            int number = 0 + (int) (Math.random() * 9);
            System.out.print(number);
        }



    }
}
