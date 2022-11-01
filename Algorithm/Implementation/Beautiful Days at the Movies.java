public static int reverse(int n){
    int rev = 0; // reversed number
      int rem;   // remainder
       
      while(n>0){
          
        rem = n%10;
        rev = (rev*10) + rem;
        n = n/10;
      }
       
      return rev;
}
public static int beautifulDays(int i, int j, int k) {
    // Write your code here
 int result=0;
 int n=i;
 while(n<=j){
     
   int reversed=reverse(n);
   int number=Math.abs(n-reversed);
   if(number % k == 0){
       result++;
    }
    n++;
  }
 return result;
    }