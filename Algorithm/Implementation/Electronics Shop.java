static int getMoneySpent(int[] keyboards, int[] drives, int b) {
        /*
         * Write your code here.
         */
         int n=keyboards.length;
         int m=drives.length;
         int highest=-1;
         
         for(int i=0;i<n;i++){
             for(int j=0;j<m;j++){
                 int sum=0;
                 sum=keyboards[i]+drives[j];
                 if(sum<=b){
                     if(sum>highest){
                        highest=sum;
                     }else{
                        continue;
                     }
                 }
             }
         }
         
return highest;
    }