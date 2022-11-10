 public static int chocolateFeast(int n, int c, int m) {
    // Write your code here
    int w=0;
    int firstBuy=n/c;
    w=firstBuy;
     while(firstBuy >= m)
            {
                w += firstBuy / m;
                firstBuy = (firstBuy / m) + (firstBuy % m);
            }

return w;
    }