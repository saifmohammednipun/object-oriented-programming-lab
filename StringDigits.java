public class StringDigits {
    public static int sum(String s){

        int sum=0;
        for(int i=0;i<s.length(); i++){
              String s1= s.substring(i, i+1);
              int digit= Integer.parseInt(s1);
              sum=sum+ digit;

        }

        return sum;

    }
    public static void main(String[] args) {
        String s= "12345";
        int p=sum(s);
        System.out.println(p);

    }
}
