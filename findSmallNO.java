public class findSmallNO {
    public static void main(String[] args) {
        int[] arr ={7,4,6,1,4,6,77,0,-1,89};
        int min = arr[0];
        for(int i=0;i<=arr.length-1;i++){
            if(min>arr[i]){
                min = arr[i];
            }
        }

        System.out.println(min);
        
    }
}
