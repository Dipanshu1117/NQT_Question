public class AddingElement {
    public static void main(String[] args) {
        int[] arr = {1,2,3,45,6,7,8,0};
        addingElementArray(arr, 0, 4);
    }

    public static void addingElementArray(int[] arr,int pos,int element){
        int n = arr.length-1;
        if(pos>n || pos<0){
            System.out.println("Invalid position");
            return;
        }
        for(int i=n-1;i>=pos;i--){
            arr[i+1]=arr[i];
        }
        arr[pos] = element;
        for(int i=0;i<=n;i++){
            System.out.println(arr[i]);
        }

    }
}
