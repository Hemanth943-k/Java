public class Armstrong {
   public static void main(String[] args) {
    int num = 371 , orginalnum , remainder , result = 0;
    orginalnum = num;
    while(orginalnum != 0){
        remainder = orginalnum % 10;
        result += Math.pow(remainder,3);
        orginalnum /= 10;
    }
    if(result == num){
        System.out.println("Armstrong");
    }
    else{
        System.out.println("Not an armstrong");
    }
   } 
}
