public class SearchElement {
    public static void main(String[] args) {
        int array[] = {};
        int element = 1;
        BinarySearch(array, element);
    }
    public static void BinarySearch(int[] arr, int element){
        int ans = -1;
        int start = 0;
        int end = arr.length-1;
        if(arr.length == 0){
            System.out.println("Array Is Empty!");
        }
        if(arr.length == 1){
            if(arr[0]==element){
                System.out.println("Element Found at Index --> 1");
                return;
            }else{
                System.out.println("Element Not Found!");
                return;
            }
        }
        while(start <= end){
            int mid = start + (end - start)/2;
            if(arr[mid] == element){
                ans = mid;
                System.out.println("Element Found At Index -->" + ans);
                break;
            }else if(arr[mid] < element){
                start = mid + 1;
            }else{
                end = mid -1;
            }

            if(ans == -1){
                System.out.println("Element Not Found!");
            }
        }
    }
}
