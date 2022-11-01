 public static void extraLongFactorials(int n) {
    // Write your code here
    BigInteger factorial = new BigInteger("1");
        
        for(int i = 2; i <= n; i++)
        {
            BigInteger multiplier = new BigInteger(String.valueOf(i));
            factorial = factorial.multiply(multiplier);
        }
        
        System.out.println(factorial);

}