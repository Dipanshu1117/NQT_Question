import java.util.*;
public class freqINArray {
    public static void main(String[] args) {
        int[] arr = {1,1,2,3,4,5,5,65,5,5};
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<=arr.length-1;i++){
            if(map.containsKey(arr[i])){
                map.put(arr[i], map.get(arr[i])+1);
            }else{
                map.put(arr[i],1);
            }
        }
        for(Integer key:map.keySet()){
            System.out.println(key +"-->"+ map.get(key));
        }
    }
}
