public class String5 {
    public static void main(String[] args) {
        String s1= "This is Exercise 1";
        String s2= "is";
        String s3 = s1.concat(s2);
        boolean s4=  s1.contains(s2);//specified character sequence.
        boolean s5 = s1.contentEquals(s2);// Specified String Buffer
        System.out.println(s5);

        char[] saif={'A','B', 'C' };

        String s6=String.copyValueOf(saif,0,3);
        System.out.println(s6);

        int result =s1.compareTo(s6);

        if(result==0) {
            System.out.println("The Strings are Equal");

        }
        else if(result>0){
            System.out.println(s1+ " is greater than "+s2 );
        }
        else if(result<0){
            System.out.println(s1+ " is less  than "+s2 );

        }


    }
}
