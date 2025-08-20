
import java.util.HashMap;

public class removeDuplicate {
    public static void main(String[] args) {
        int[] arr = {1,2,3,5,5,6,77,7,7};
        remDuplicateElement(arr);
    }
    public static void remDuplicateElement(int[] arr){
        int n = arr.length-1;
        int k = 0;
        int[] ans = new int[n];
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i <= n; i++) {
            if(map.containsKey(arr[i])){
                map.put(arr[i],map.get(arr[i])+1);
            }else{
                map.put(arr[i],1);
            }
        }
        for(Integer key:map.keySet()){
            if(map.get(key)==1){
                ans[k++]=key;
            }
        }
        for(int i=0;i<n;i++){
            System.out.println(ans[i]);
        }
    }
}
