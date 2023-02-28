

public class TwelveClass {
    public static void main(String[] args) {
        int n =5;

        for( int i =1; i<=5; i++){
            for( int j=1; j<=(2*i-1); j++){
                if(i%2==0){
                    System.out.print("+ ");

                }
                else if(i%2==1){
                    System.out.print("* ");
                }

            }
            System.out.println();
        }






    }
}
