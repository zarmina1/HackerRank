 public static long taumBday(int b, int w, int bc, int wc, int z) {
    // Write your code here
    long c = b; 
    long e=w;
    long  d = Math.min(bc, wc + z);
    long f = Math.min(wc, bc + z);
    long result=(c*d)+(e*f);
    return result;
    }