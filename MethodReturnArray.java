public class MethodReturnArray {
    public static int[] returnArray(int[] arr1, int[] arr2){
        int sum1=0;
        int sum2=0;


        for(int i=0; i<arr1.length; i++){
            sum1= sum1+ arr1[i];
        }
        System.out.println(sum1);

        for(int i=0; i<arr2.length; i++){
            sum2= sum2+ arr2[i];
        }
        System.out.println(sum2);


        if(sum1<sum2){
            return arr2;
        }

       return arr1;

    }


    public static void main(String[] args) {
        int[] arr1 = {1,2,3};
        int[] arr2 = {1,2,5};

        int[] array= returnArray(arr1, arr2);
        for(int i=0; i<array.length; i++){
            System.out.println(array[i]);
        }

    }
}
