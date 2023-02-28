public class FifthClass {
    public static void main(String[] args) {
        int n=6;
        for( int i =0; i<=n; i++){
            for( int j = 1; j<=i; j++){
                System.out.print("  ");
            }

            for(int x=1; x<=n-i; x++ ){
                System.out.print(x+ " ");
            }

            System.out.println();
        }
    }
}
