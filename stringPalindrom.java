class stringPalindrom{
    public static void main(String[] args) {
        String s = "";
        s = s.toLowerCase();
        if(s.length()==0){
            System.out.println("String is Empty");
            return;
        }
        int i = 0;
        int j = s.length()-1;
        while(i<=j){
            if(s.charAt(i) == s.charAt(j)){
                i++;
                j--;
            }else{
                System.out.println("String is not Palindrom!");
                return;
            }
        }
        System.out.println("String is palindrom");

    }
}