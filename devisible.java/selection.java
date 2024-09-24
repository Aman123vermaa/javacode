public class selection {
    public static void main(int arr[] int n) {
        for(int i=0; i<n-1;i++){
            int mini =i;
            for(int i=i+1; j<n;i++){
                if (arr[i]<arr[mini]) {
                    mini=j; 
                }
        }
        //swaping
        int temp=arr[mini];
        arr[mini]=arr[i];
        arr[i]=temp;
        System.out.println("After sselection sort");
        for(int i=0;i<n;i++){
            System.out.println(arr[i]+" ");

        }
        System.out.println();
    }
    
}
