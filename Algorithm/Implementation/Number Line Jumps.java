   public static String kangaroo(int x1, int v1, int x2, int v2) {
    // Write your code here
    String r="NO";
    while(x1<x2){
       x1 += v1;
       x2 += v2;
        if(x1 == x2){
            r="YES";
        }
    }
     return r;
    }