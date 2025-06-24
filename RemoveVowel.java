public class RemoveVowel {
    public static void main(String[] args){
      String str = "hemanth";
      for(int i=0; i<str.length();i++){
        char ch = str.charAt(i);
        
        if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ){
          continue;
        }
         System.out.print(ch);
      }
  }
}