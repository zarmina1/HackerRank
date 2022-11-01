 public static void kaprekarNumbers(int p, int q) {
    // Write your code here
     boolean flag = false;//Denotes if a Kaprekar number has been found
     if(p == 1)//Handle the one case where a 1 digit square is a Kaprekar
        {
            System.out.print(p+" ");
            flag = true;
        }
     for(long i=p;i<=q;i++){
         long squareLong = i * i;
        String squareStr = String.valueOf(squareLong);
        if(squareStr.length() > 1)
            {
                long left = Long.parseLong(squareStr.substring(0,(int)Math.ceil(squareStr.length()/2)));
                long right = Long.parseLong(squareStr.substring((int)Math.ceil(squareStr.length()/2), squareStr.length()));
                if(left+right == i)
                {
                    System.out.print(i+" ");
                    flag = true;
                }
            }
     } 
     
     
     if(!flag)
        {
            System.out.println("INVALID RANGE");
        }
    }
