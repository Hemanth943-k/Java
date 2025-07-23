import java.util.*;
public class MergeTwoArrays{
    public static void main(String[] args){
        int arr[] = {1,2,3};
        int arr2[] = {4,5,6};
        int c[] = new int[arr.length + arr2.length];
        for(int i=0; i<arr.length; i++){
          c[i] = arr[i];
        }
        for(int i=0; i<arr2.length; i++){
          c[i + arr.length] = arr2[i];
        }
        System.out.println(Arrays.toString(c));
      
    }
}
