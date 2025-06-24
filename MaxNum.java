public class MaxNum {
    public static void main(String[] args) {
        int arr[] = {1,2,3,64,8,9,10};
        int max = arr[0];
        for(int i=0; i<arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        System.out.println(max);
    }
}
