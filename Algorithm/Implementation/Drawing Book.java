   public static int pageCount(int n, int p) {
    // Write your code here
        int beg = (p/2);
        int end = 0;
        if(n%2==1)
            end = (n-p)/2;
        else
            end = (int) Math.ceil((n-p)/2.0);
        
    return Math.min(beg,end);

}