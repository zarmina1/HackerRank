 public static String timeInWords(int h, int m) {
    // Write your code here
     HashMap<Integer, String> words = new HashMap<>();
      String Result="";
        words.put(1,"one");words.put(2,"two");
        words.put(3,"three");words.put(4,"four");
        words.put(5,"five");words.put(6,"six");
        words.put(7,"seven");words.put(8,"eight");
        words.put(9,"nine");words.put(10,"ten");
        words.put(11,"eleven");words.put(12,"twelve");
        
        words.put(13,"thirteen");
        words.put(14,"fourteen");
        words.put(15,"fifteen");
        words.put(16,"sixteen");
        words.put(17,"seventeen");
        words.put(18,"eighteen");
        words.put(19,"nineteen");
       
        if(m < 30){
     
            if(m > 1)
            {
                if(m > 20)
                { 
                    Result="twenty "+words.get(m-20)+" minutes past "+words.get(h);}
                else if(m == 15)
                { 
                    Result="quarter past "+words.get(h);}
                else
                { 
                    Result=words.get(m)+" minutes past "+words.get(h);}
            }else if (m == 0||m==00){
                  Result=words.get(h)+" o' clock";
            }else if(m==1){
                Result=words.get(m)+" minute past "+words.get(h);
            }else
            { Result=words.get(m)+" minute past "+words.get((h+1)%12);}
        }else if(m > 30){
            if(m==45)
            {Result="quarter to "+words.get((h+1)%12);}
            else if(60-m > 20){
                Result="twenty "+words.get(60-m-20)+" minutes to "+words.get((h+1)%12);}
            else if(60-m < 20){
                Result=words.get(60-m)+" minutes to "+words.get((h+1)%12);}
            else{
                Result="twenty minutes to "+words.get((h+1)%12);}
        }else{
            Result="half past "+words.get(h);
            }
    return Result;
    }