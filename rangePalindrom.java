public class rangePalindrom {
     public static void main(String[] args){
         Palindrom(100,200);
    }
    public static void Palindrom(int min , int max){
        int ans = 0;
        int res =0;
        for(int i=min;i<=max;i++){
            int org = i;

            while(i > 0){
            ans = i%10;
            res = (res*10)+ans;
            i /=10;
            }
         if(org == res){
            System.out.println(i);
        }

        }
    }
}
