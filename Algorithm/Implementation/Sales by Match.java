public static int sockMerchant(int n, List<Integer> ar) {
    // Write your code here
    int pairCount=0;
    List<Integer> Unique= ar.stream().distinct().collect(
                Collectors.toList());
    for(int j=0;j<Unique.size();j++){
      int sum=0;
      for(int i=0;i<n;i++){
          if(Unique.get(j)==ar.get(i)){
              sum++;
          }
       }
       int div=sum/2;
       pairCount+=div;
      
    }
   return pairCount;
    }