public class sumOfArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int n = arr.length-1;
        int sum = 0;
        for(int i=0;i<=n;i++){
            sum += arr[i];
        }
        System.out.println(sum);
    }
}
