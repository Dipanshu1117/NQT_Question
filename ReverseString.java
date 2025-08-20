
import java.util.Stack;

public class ReverseString {
    public static void main(String[] args) {
        String s = "Dipanshu";
        Stack<Character> st = new Stack<>();
        for(int i=0;i<s.length();i++){
            st.push(s.charAt(i));
        }
        StringBuilder sb = new StringBuilder();
        while(!st.isEmpty()){
            char ch = st.pop();
            sb.append(ch);
        }
        System.out.println("After the Reverse string --->  "+sb);
        
    }
}
