public class palindrome {
 public static void main(String[] args) {
     int num = 555;
     int reverse = 0;
     int temp = num;
     while(temp > 0){
        int remainder = temp % 10;
        reverse = reverse * 10 + remainder;
        temp /= 10;
     }
     if(num == reverse){
        System.out.println("Palindrome");
     }
     else{
        System.out.println("not palindrome");
     }
 }   
}
