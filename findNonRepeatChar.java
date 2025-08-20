import java.util.HashMap;

public class findNonRepeatChar {
    public static void main(String[] args) {
        String s = "DipanaDshu";
        NonRepeat(s);

    }
    public static void NonRepeat(String s){
        HashMap <Character,Integer> map = new HashMap<>();
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(map.containsKey(ch)){
                map.put(ch,map.get(ch)+1);
            }else{
                map.put(ch,1);
            }
        }
        for(Character key:map.keySet()){
            if(map.get(key) == 1){
                System.out.println(key);
            }
        }
    }
}
