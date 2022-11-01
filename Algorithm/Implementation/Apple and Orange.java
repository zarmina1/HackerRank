 public static void countApplesAndOranges(int s, int t, int a, int b, List<Integer> apples, List<Integer> oranges) {
    // Write your code here
    int o=0;
    int aa=0;
    int m=apples.size();
    int n=oranges.size();
for(int i=0;i<m;i++){
    apples.set(i, apples.get(i)+a);
    if(apples.get(i)>=s&& apples.get(i)<=t){
        aa++;
       
    }
    
}
for(int j=0;j<n;j++){
    oranges.set(j, oranges.get(j)+b);
    if(oranges.get(j)>= s &&oranges.get(j)<=t){
        o++;

    }
}
 System.out.println(aa);
 System.out.println(o);
}