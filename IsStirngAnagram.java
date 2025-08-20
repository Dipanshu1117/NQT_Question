import java.util.HashMap;

public class IsStirngAnagram {
    public static void main(String[] args) {
        String s = "cat";
        String t = "ac";
        isAnagram(s, t);

    }
    public static boolean isAnagram(String s , String t){
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(map.containsKey(ch)){
                map.put(ch,map.get(ch)+1);
            }else{
                map.put(ch,0);
            }
        }
        for(int i=0;i<t.length();i++){
            char ch = t.charAt(i);
            if(map.containsKey(ch)){
                map.remove(ch);
            }else{
                map.put(ch,0);
            }
        }
        if(map.isEmpty()){
            System.out.println("true");
            return true;
        }
        System.out.println("false");
        return false;

    }
}
