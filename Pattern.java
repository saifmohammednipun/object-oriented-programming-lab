public class Pattern {
    public static void main(String[] args) {


        int n =7;

        for(int i =1; i<=n; i++){
            for(int j=1; j<=n-i; j++){
                System.out.print("_ ");
            }
            for(int x=1;  x<=i-1; x=x*2){
                System.out.print(x+ " ");
          }

            for(int y=i; y>=1; y=y/2){
               System.out.print(y+" ");
            }
            System.out.println();
        }
    }
}
