public class Math5 {

    public static int smallest(int a, int b, int c){


        int d= Math.min(Math.min(a,b), c);


        return d;

    }
    public static void main(String[] args) {

        int a=7;
        int b =8;
        int c =9;

        int e =smallest(a,b,c);
        System.out.println(e);
    }
}
