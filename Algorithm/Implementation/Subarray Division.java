public static int birthday(List<Integer> s, int d, int m) {
    // Write your code here
    int count=0;
  
    for(int i=0;i<s.size();i++){
        int sum=0;
        int temp=0;
        int j=i;
         while (m != temp) {
                if (j < s.size()) {
                   
                    sum = sum + s.get(j++); 
                }
                temp++;
            }
         System.out.println("sum: "+sum);
        if(sum==d){
            count++;
        }
        
    }
    return count;

    }
