public class capWord {
    public static void main(String[] args) {
        String s = "hello world ";
        StringBuilder st = new StringBuilder(s);
        for(int i=0;i<st.length();i++){
            char ch = st.charAt(i);
            if(i==0 || i == st.length()-1){
                st.setCharAt(i,Character.toUpperCase((char)(int) st.charAt(i)));
            }else if(ch == ' '){
                st.setCharAt(i-1,Character.toUpperCase((char)(int) st.charAt(i-1)));
                st.setCharAt(i+1,Character.toUpperCase((char)(int) st.charAt(i+1)));
            }
        }
        System.out.println("After Change -->"+st);
    }
}
