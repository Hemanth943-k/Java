public class SecondLargest {
  public static int SecondLargest(int[]arr){
    int n = arr.length;
    int largest = -1;
    int secLargest = -1;
    
    for(int i=0; i<n; i++){
      if(arr[i] > largest){
        secLargest = largest;
        largest = arr[i];
      }
      else if(arr[i] < largest && arr[i] > secLargest){
        secLargest = arr[i];
      }
    }
    return secLargest;
  }
  
    public static void main(String[]args){
      int arr[] = {1,2,3,4,5};
      System.out.println(SecondLargest(arr));
    }
}