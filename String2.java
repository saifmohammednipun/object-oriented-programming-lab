public class String2 {
    public static void main(String[] args) {
        String s = "w3resource.com";
        System.out.println("Original String: "+s);
        int a=s.codePointAt(1);
        int b=s.codePointAt(9);
        System.out.println("Character(unicode point) = "+ a);
        System.out.println("Character(unicode point) = "+ b);


    }
}
