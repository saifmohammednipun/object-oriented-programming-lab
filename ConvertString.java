public class ConvertString {
    public static void main(String[] args) {
        String s= "12345";
        int integer= Integer.parseInt(s);
        System.out.println(integer);

        int number=1234;
        String d= ""+number;
        System.out.println(d);

        String s1 = "Saif Mohammed";

        String s2 = "Mohammed";

        for(int i=0; i<s2.length(); i++){
           String s4 =s2.substring(i,i+1)+s2.substring(i,i+1);
            System.out.print(s4);
        }



        System.out.println(s1.startsWith(s2));


        System.out.println(s1.toLowerCase());
        System.out.println(s1.toUpperCase());
        System.out.println(s1.replaceAll("Saif", "Asif "));
        char[] c=s1.toCharArray();
        System.out.println(c);
        boolean b = s1.contains(s2);
        System.out.println(b);
    }
}
