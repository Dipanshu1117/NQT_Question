class removeDuplicateChar{
    public static void main(String[] args) {
        String s ="aabcdd";
        System.out.println(Remove(s));
    }
    public static String Remove(String s){
        boolean[] map = new boolean[26];
        String ans = "";
        for(int i=0;i<s.length();i++){
            if(map[s.charAt(i)-'a'] == false){
                ans += s.charAt(i);
                map[s.charAt(i)-'a']=true;
            }
        }
        return ans;

    }
}