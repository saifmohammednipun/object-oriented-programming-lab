public class NineClass {
    public static void main(String[] args) {
        int n = 6;

        for(int i =0 ; i<=6; i++){
            for (int j=0; j<=i-1; j++){
                System.out.print("_ ");
            }

            for (int x=1; x<=n-i; x++){
                System.out.print(x+ " ");
            }
            System.out.println();
        }

    }
}
