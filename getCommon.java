import java.util.*;
public class getCommon {
  public static void getCommonElement(int arr1[],int arr2[]){
    HashMap <Integer,Integer> map = new HashMap<>();
    for(int i=0; i<arr1.length; i++){
      map.put(arr1[i],1);
    }
    
    for(int i=0; i<arr2.length; i++){
      if(map.containsKey(arr2[i])){
        System.out.println(arr2[i]);
      }
    }
  }
  public static void main(String[]args){
   int arr1[] = {1,2,9,5,6};
   int arr2[] = {1,4,6,7,0};
   getCommonElement(arr1,arr2);
   
  }
}