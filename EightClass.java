public class EightClass {
    public static void main(String[] args) {
        int n=6;
         for (int i =1; i<=n; i++){
             for(int j =1; j<=n-i; j++){
                 System.out.print("* ");

             }

             for(int x= i; x>=1; x--){
                 System.out.print(x + " ");
             }
             System.out.println();

         }
    }
}
