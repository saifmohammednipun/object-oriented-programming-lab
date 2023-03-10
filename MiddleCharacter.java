public class MiddleCharacter {
    public static void main(String[] args) {
        String s = "Mohamed";
        int position;
        int length;

            if(s.length()%2==0){
                position =(s.length()/2)-1;
                length =2;

                System.out.println(s.substring(position,position+length));

            }
            else{
                position =s.length()/2;
                length =1;

                System.out.println(s.substring(position,position+length));

            }


    }
}
