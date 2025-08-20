
import java.util.Arrays;

public class medianOfArray {
    public static void main(String[] args) {
        int[] arr = {4, 7, 1, 2, 5, 6};
        Arrays.sort(arr);
        median(arr);
    }
    public static void median(int[] arr){
        int n = arr.length;
        int mid = n/2;
        System.out.println(mid);
        if(n%2 != 0){
            System.out.println(arr[mid]);
        }else{
            int ind1 = (n / 2) - 1;
		    int ind2 = (n / 2);
		    System.out.print((double)(arr[ind1] + arr[ind2]) / 2);
        }
        

    }
}
