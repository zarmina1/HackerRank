public static int diagonalDifference(List<List<Integer>> arr) {
    // Write your code here
     int leftSum=0;
     int rightSum=0;
     int size=arr.size();
     int diff=0;
     int k=0;
         for (int i = 0; i < arr.size(); i++) {
            for (int j = 0; j < arr.get(i).size(); j++) {
                System.out.print(arr.get(i).get(j) + " ");
            }
            System.out.println();
        }
        while(k<size){
             rightSum=rightSum+arr.get(k).get(k);
              k++;
        }
        
        k=0;
        int h=size-1;
        while(k<size){
            leftSum=leftSum+arr.get(k).get(h);
            k++;
            h--;
        }
        if(rightSum>leftSum){
             diff=rightSum-leftSum;
        }else{
             diff=leftSum-rightSum;
        }
       
        return diff;
    }