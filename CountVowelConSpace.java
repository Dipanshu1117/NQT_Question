public class CountVowelConSpace {
    public static void main(String[] args) {
        String s = "Dipanshu verma ";
        s = s.toLowerCase();
        int vowel=0;
        int consonent = 0;
        int space =0;
        for(int i=0;i<=s.length()-1;i++){
            char ch = s.charAt(i);
            if(ch=='a' || ch=='e'||ch=='i'||ch=='o'||ch=='u'){
                vowel++;
            }else if(ch >='a' && ch<='z'){
                consonent++;
            }else if(ch == ' '){
                space++;
            }
        }
        System.out.println("Vowel is -->"+vowel);
        System.out.println("Consonents is -->"+consonent);
        System.out.println("Blank space is -->"+space);
       
    }
}
