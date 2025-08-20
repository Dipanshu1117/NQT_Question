public class palindrom {
    public static void main(String[] args){
         Palindrom(1221);
    }
    public static void Palindrom(int num){
        int ans = 0;
        int org = num;
        int res =0;
        while(num > 0){
            ans = num%10;
            res = (res*10)+ans;
            num /=10;
         
        }

        if(org == res){
            System.out.println("Number is Palindrom");
        }else{
            System.out.println("Number is Not Palindrom");
        }
    }
}
