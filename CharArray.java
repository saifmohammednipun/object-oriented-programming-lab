public class CharArray {
    public static void main(String[] args) {
        String s1 = "Saif Mohammed";
        int index=0;
        int count=0;
        char[] c =s1.toCharArray();

        for(int i=0;i<s1.length(); i++) {
          for(int j=0; j<i; j++){
              if(c[i]==c[j]){
                  count++;
              }
              if(i==j){
                  c[index++] = c[i];

              }

          }
        }

        System.out.println(count);
        String s2=c.convertStringArrayToString()
        System.out.println(s2);





    }
}
