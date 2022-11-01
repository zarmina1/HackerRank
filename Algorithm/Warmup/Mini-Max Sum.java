 public static void miniMaxSum(List<Integer> arr) {
    // Write your code here
       long sum=0;
       long min=arr.get(0);
       long max=0;
       int n=arr.size();
       for(int i=0;i<n;i++){
           long item=arr.get(i);
            sum+=arr.get(i);
           if (item < min) {
            min = item ;
            } 
            if (item > max) {
            max = item;
            }
       }
       
 System.out.println((sum - max) + " " + (sum - min));
    }
