 public static int hurdleRace(int k, List<Integer> height) {
    // Write your code here

Collections.sort(height);
int maxHeight=Collections.max(height);
int result=0;
if(k<maxHeight){
result=maxHeight-k;}
return result;
    }