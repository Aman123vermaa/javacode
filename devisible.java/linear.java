public class linear{
    public staticvoid main(String[] args){
        int[] arr={2,1,3,4,2,5,7};
        int find=3;
        for(int i=0; i<arr.length;i++){
            if(arr[i]==find){
                System.out.println("true");
                break;
            }
        }
    }
}