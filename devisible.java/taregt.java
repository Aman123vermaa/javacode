public class taregt {
    public static void main(String[] args) {
        int[] arr={12,3,4,5,6,7};
        int target =9;
        for(int i=0;i<arr.length;i++){
            for(int j =i+1;j<arr.length;j++){
            if (arr[i]+arr[j]==target) {
            
            System.out.println(arr[i]);
            System.out.println(arr[j]);
            break;
            }
        }
     }   
        System.out.println();
    }
}
