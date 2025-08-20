class CheckSubset{
    public static void main(String[] args){
        int[] arr1 = {1,3,4,5,2};
        int[] arr2 = {4,5,2};
        Subset(arr1, arr2);

    }
    public static void Subset(int[] arr1,int[] arr2){
        int n = arr1.length;

        for (int i = 0; i < n; i++) {
            boolean flag = false;
         for(int j=0;j<arr2.length;j++){
            if(arr1[i] == arr2[j]){
              flag= true;
            }
         }
           if(flag == false){
             System.out.println("Arr1 is not substring of arr2");
             return;
           }
           
       }
       System.out.println("Arr1 is the Substring of arr2");
    }
}