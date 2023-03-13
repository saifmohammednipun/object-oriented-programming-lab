//Write a program to return the index of the Second Last vowel in a String
public class LabTask5 {
    public static void main(String[] args) {
        String s = "corresponding";
        int count = 0;
        char a = ' ';
        char[] s1 = s.toCharArray();

        char[] ch = new char[]{'a', 'e', 'i', 'o', 'u'};

        for(int i= s1.length-1; i>=0; i--){
            for(int j=0; j<ch.length; j++ ){
                if(s1[i]==ch[j])
                {
                    count++;
                    a=s1[i];
                    if(count==2){
                        System.out.println(a);
                        System.out.println(i);
                    }
                }
            }

        }

    }
}
