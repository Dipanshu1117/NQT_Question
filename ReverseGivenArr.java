public class ReverseGivenArr {
    public static void main(String[] args) {
        int[] arr = {1,2,34,45,6,7,8,99};
        int i=0;
        int j=arr.length-1;
        while(i <= j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }

        for(int k=0;k<=arr.length;k++){
            System.out.println(arr[k]);
        }
        
    }
}
