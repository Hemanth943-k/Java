public class MaxSubArr {
  static int Subarray(int[]arr){
    int res = arr[0];
    int n = arr.length;
    for(int i=0; i<n; i++){
      int cursum = 0;
      for(int j=i; j<n; j++){
        cursum += arr[j];
        res = Math.max(res,cursum);
      }
    }
    return res;
  }
    public static void main(String[]args){
      int[]arr = {1,2,-3,5,8,-2,-6,-8};
      System.out.println(Subarray(arr));   
  }
}