public static int jumpingOnClouds(List<Integer> c) {
    // Write your code here
  int jumps = 0;
        int n =c.size();
        int i = 0;
        while(i < n-3) //goes through all clouds up until the last jump
        {
            i += (c.get(i+2) == 0) ? 2 : 1;
            jumps++;                
        }
        
        jumps++;//This is the last jump that will be either a 1 or 2
        
        System.out.println(jumps);
        return jumps;
    }