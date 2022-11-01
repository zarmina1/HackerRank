  public static int findDigits(int n) {
    // Write your code here
    int result=0;
       String numberString = String.valueOf(n);
       System.out.println("numberString: "+numberString);
       int size=numberString.length();
       for(int i=0;i<size;i++){
           int digit = Character.getNumericValue(numberString.charAt(i));
                    
                if(digit != 0 && n % digit == 0)
                {
                    result++;
                }
       }
       return result;
    }