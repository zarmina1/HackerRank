 public static int getTotalX(List<Integer> a, List<Integer> b) {
    // Write your code here
    int maxA=a.get(a.size()-1);
    int minb=b.get(0);

     
     int integersBetween = 0;
        
        intCheck: 
        for(int i = maxA; i <= minb; i += maxA)
        {
            //Check if all A are a factor of i
            for(int num : a)
            {
                if(i%num != 0)
                {
                    continue intCheck;
                }
            }
            
            //Check if i is a factor of all B
            for(int num : b)
            {
                if(num%i != 0)
                {
                    continue intCheck;
                }
            }
            integersBetween++;
        }
       return integersBetween; 
    }