public class main{
    public static void main(String[] args) {
        int[] arr={-15,0,24,28,3,30,45};
        for(int i=0; i<arr.length;i++){
            if (arr[i]%3==0 && arr[i]%5==0) {
                count++;            }
        }
        System.out.println(count);
        
    }
    
    
}