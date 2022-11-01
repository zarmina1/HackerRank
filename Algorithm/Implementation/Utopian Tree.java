 public static int utopianTree(int n) {
    // Write your code here

   int result=0;
for(int i=0;i<=n;i++){
    if(i % 2 == 0)
            {
            result=((int) (Math.pow(2, i/2)*2) -1);
             
            }
            else
            { result=((int) ((Math.pow(2, (i-1)/2)*2) -1)*2);
         
            }
}
   return result;
    }