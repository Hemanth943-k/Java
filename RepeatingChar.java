import java.util.*;
public class RepeatingChar {
  public static void RepeatingChar(String str){
    HashSet<Character> map = new HashSet<>();
    for(int i=0; i<str.length();i++){
      char ch = str.charAt(i);
      if(map.contains(ch)){
        System.out.println(ch);
        return;
      }
      else{
        map.add(ch);
      }
    }
    System.out.println(-1);
  }
    public static void main(String[] args){
      String str = "hemanthmeghana";
      RepeatingChar(str);
      
  }
}