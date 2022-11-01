 public static List<Integer> breakingRecords(List<Integer> scores) {
    // Write your code here
    
     int minCount=0;
     int maxCount=0;
     int min=scores.get(0);
     int max=scores.get(0);
     for(int i=0;i<scores.size();i++){
         int temp=scores.get(i);
         if(temp<min){
             min=temp;
             minCount++;
             }
          if(temp>max){
              max=temp;
              maxCount++;
          }
           
     }
List<Integer> count=new ArrayList<>(2);
count.add(maxCount);
count.add(minCount);

return count;
    }