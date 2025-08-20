public class RemoveVowels {
    public static void main(String[] args) {
        String s = "Dipanshu";
        s = s.toLowerCase();
        for(int i=0;i<=s.length()-1;i++){
            char ch = s.charAt(i);
            if(ch=='a' || ch=='e'||ch=='i'||ch=='o'||ch=='u'){
                s=s.substring(0,i) + s.substring(i+1);
            }
        }
        System.out.println(s);
    }
}
