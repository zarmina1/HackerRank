 public static int birthdayCakeCandles(List<Integer> candles) {
    // Write your code here
    int total=0;
     int height;
     Collections.sort(candles);
     int n=candles.size();
     height=candles.get(n-1);
      for(int i=0;i<n;i++){
          if(candles.get(i)==height){
              total++;
          }
      }
      return total;
    }