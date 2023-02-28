public class ElevenClass {
    public static void main(String[] args) {

        int n=7;

        for(int i =1; i<=n; i++){
            for(int j =1; j<=n-i; j++){
                System.out.print("* ");
            }
int j=1;
            for( int x=1; x<=2*j; x++){
                System.out.print(x+ " ");
            }
            System.out.println();
        }
    }
}
