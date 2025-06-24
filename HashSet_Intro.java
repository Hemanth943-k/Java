import java.util.*;

public class HashSet_Intro {
  public static void main(String[]args){
    HashSet<Integer> set = new HashSet<>();
    // adding
    set.add(1);
    set.add(10);
    set.add(11);
    set.add(20);
    set.add(30);
    
    set.add(20);
    
    // remove
    set.remove(1);
    //size;
    System.out.println(set.size());
    
    System.out.println(set);
    System.out.println(set.contains(1));
    System.out.println(set.contains(35));
  }
}