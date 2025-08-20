public class secondSmall {
    public static void main(String[] args) {
        int[] arr = {34,54,2,4,5,33,545};
        int secSmall = Integer.MAX_VALUE;
        int small = arr[0];
        for(int i=0;i<arr.length;i++){
            if(small > arr[i]){
                secSmall = small;
                small = arr[i];
            }else if (arr[i] < secSmall && arr[i] != small){
		      secSmall = arr[i];
	        }
        }
        System.out.println(small);
        System.out.println(secSmall);
    }
}
