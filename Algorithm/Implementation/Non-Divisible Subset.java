 public static int nonDivisibleSubset(int k, List<Integer> s) {
    // Write your code here
      int f[] = new int[k];
        Arrays.fill(f, 0);
        for(int i=0;i<s.size();i++){
            f[s.get(i)%k]++;
        }
        if (k % 2 == 0){
            f[k/2] = Math.min(f[k/2], 1);
            }
        int res = Math.min(f[0], 1);
        
        for (int i = 1; i <= k/2; i++)
            res += Math.max(f[i], f[k-i]);
     
        return res;
    }