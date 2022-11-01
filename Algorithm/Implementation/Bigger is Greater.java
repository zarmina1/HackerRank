public static String biggerIsGreater(String w) {
    // Write your code here
    int n=w.length();
    String result="";
       if(n==1) {
           result="no answer";
           System.out.println("no answer");
          }
    
         int maxLexoC1 = 0; //The max lexocographical according to condition 1
         int maxLexoC2 = 0; //The max lexocographical according to condition 2
         
      for(int i=1;i<n;i++){
             boolean condition1 = w.charAt(i) > w.charAt(i-1);
                    
                if(condition1)
                {
                    maxLexoC1 = (i > maxLexoC1) ? i : maxLexoC1;
                }
    }
    
     if(maxLexoC1==0) {
         result="no answer";
         System.out.println("no answer");
         
         }else{
             for(int j = maxLexoC1; j < n; j++)
            {
                boolean condition2 = w.charAt(j) > w.charAt(maxLexoC1-1);
                    
                if(condition2)
                {
                    maxLexoC2 = j;
                }
            }
            StringBuilder wordSB = new StringBuilder(w);
            
            //Swap the pivot with maxLexoC2
            char tmp = wordSB.charAt(maxLexoC1-1);
            wordSB.setCharAt(maxLexoC1-1, wordSB.charAt(maxLexoC2));
            wordSB.setCharAt(maxLexoC2, tmp);
                        
            
            //Reverse starting at the element to the right of the pivot
            int left = maxLexoC1;
            int right = wordSB.length()-1;
            while(left < right)
            {
                //swap left with right
                tmp = wordSB.charAt(left);
                wordSB.setCharAt(left, wordSB.charAt(right));
                wordSB.setCharAt(right, tmp);
                left++;
                right--;
            }
            
            result+=wordSB;
            System.out.println(wordSB);
            }
            return result;
    }
