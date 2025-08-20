public class RemoveChar {
    public static void main(String[] args) {
       String s = "i am so1234567889ftware dev#$%^eloper";
       StringBuilder st = new StringBuilder();
       
       for(int i=0;i<s.length();i++){
        char ch = s.charAt(i);
        if(ch >= 'a' && ch<='z'){
            st.append(ch);
        }
       }
       System.out.println("After Remove Blank Space -->"+ st);
   } 
}
