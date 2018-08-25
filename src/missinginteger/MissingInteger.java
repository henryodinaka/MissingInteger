package missinginteger;

import java.util.Arrays;

/**
 *
 * @author LEOGOLD
 */
public class MissingInteger {

    static  int [] numbers ={1,2,4,5,3,7};
    public static void main(String[] args) {
       Arrays.sort(numbers);
        for(int i =0; i<numbers.length;i++){
            System.out.println("Sorted arrays Items: "+numbers[i]);
            
        }
    }
    
}
