class MissingValue{
  public static void main(String[]args){
    int arr[] = {1,2,0,3,4,5,6,8};
    int n = arr.length;
    int sum=(n*(n+1))/2; 
    int s = 0;
    int miss = 0;
    for(int i=0; i<n; i++){
      s += arr[i];
      miss = sum - s;
    }
    System.out.println(miss);
  }
}