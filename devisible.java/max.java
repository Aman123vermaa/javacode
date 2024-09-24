
public class max {
    public static void main(String[] args) {
        int n;
        int[] arr = {12,3,5,6,89,44};
        int max=Integer.MIN_VALUE;
        for(int i=0; i<arr.length;i++){
            if(max<arr[i]){
                max =arr[i];
            }
       
        }
        System.out.println(max);
    }
    
}
