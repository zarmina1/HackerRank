public static String appendAndDelete(String s, String t, int k) {
    // Write your code here
    int sSize=s.length();
    int tSize=t.length();
    String result="";
   if(s.equals(t)){
       result=(k >= sSize*2 || k % 2 == 0) ? "Yes" : "No";
   }else{
          int matchingCharacters = 0;
            
            for(int i = 0; i < Math.min(sSize, tSize); i++)
            {
                //ado
                //adolol
                if(s.charAt(i) != t.charAt(i))
                {    
                    break;
                }
                matchingCharacters++;
            }
            
            int nmcS = sSize - matchingCharacters;
            int nmcT = tSize - matchingCharacters;
            
            boolean conditionA = nmcS + nmcT == k;
            boolean conditionB = (nmcS + nmcT < k && (nmcS + nmcT - k) % 2 == 0 );
            boolean conditionC = sSize + tSize <= k;
            
            result = (conditionA || conditionB || conditionC) ? "Yes" : "No"; 
   }
   
return result;
}