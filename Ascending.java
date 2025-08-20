public class Ascending {
    public static void main(String[] args) {
        int[] arr = {1,12,34,45,6,17,8,99};
        int n = arr.length-1;
        for(int i=0;i<=n;i++){
            for(int j=0;j<n-i;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        for(int j=0;j<n;j++){
                System.out.println(arr[j]);
            }

    }
}
