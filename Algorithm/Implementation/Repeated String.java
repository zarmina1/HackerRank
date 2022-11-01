 public static long repeatedString(String s, long n) {
    // Write your code here
     int f=0;
     long totalCount=0;
     int size=s.length();
     
     for(int i=0;i<size;i++){
         if(s.charAt(i) == 'a')
            {
                f++;
            }
     }
      //Determines how many complete substrings we will analyze
        long divisor = n / size;
        
        totalCount += divisor * f;
        
        
        //Determines how many characters in we will analyze towards the end of our n range
        long remainder = n % size;
        
        for(int i = 0; i < remainder; i++)
        {
            if(s.charAt(i) == 'a')
            {
                totalCount++;
            }
        }
        return totalCount;
        
    }