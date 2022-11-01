public static List<Integer> cutTheSticks(List<Integer> arr) {
       
    // Write your code here
     Collections.sort(arr);
     int n=arr.size();
     int sticksLeft = n;
     int curr = arr.get(0);
     List<Integer> result=new ArrayList<Integer>();
     int index=0;
     result.add(index, sticksLeft);
     int currCount = 0;
      for(int i = 0; i < n; i++)
        {
           
            if(curr == arr.get(i))
            {
                currCount++;
              
            }else{
                sticksLeft -= currCount;
                currCount = 1;
                curr = arr.get(i);
                index++;
                result.add(index, sticksLeft);
                
            }
           
        }
        return result;
    }