public class RemoveSpace {
   public static void main(String[] args) {
       String s = "i am software developer";
       for(int i=0;i<s.length();i++){
        char ch = s.charAt(i);
        if(ch == ' '){
            s = s.substring(0,i) + s.substring(i+1);
        }
       }
       System.out.println("After Remove Blank Space -->"+ s);
   } 
}
