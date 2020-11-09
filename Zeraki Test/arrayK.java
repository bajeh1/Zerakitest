import java.util.Arrays;

/**
 * arrayK
 */
public class arrayK {

    public static void main(String[] args) {
        //  declare an array k
        int[] k = { 3,  4,2 ,1,5,6,7,8,10 };
        // Sort the array in ascending formt
        Arrays.sort(k);

        
// Get the sum of the integers in the array k
       int sum =0;
        for (int i :k) {
              sum=sum+i;
        }

  

        //  get n as the number of integaers in the array k
        int n =0;
        for (int i = 0; i < k.length; i++) {
            n=n+1;

            
        }
        

              /*  Get the sum of the integers in the array plus the missing Integer
       the Formula to calculate the sum on integers in an array is  n*(n+1)/2
         */
    int total=(n+1)*(n+1+1)/2;


    int missingNo=total-sum;
    System.out.println("Missing Number is:"+missingNo);
    // System.out.println("Sum of reale rray elements is:"+total);
    //     System.out.println("Sum of array elements is:"+sum);
    //     System.out.printf("sorted Array  : %s", Arrays.toString(k));

    }
}