  public static int minimumDistances(List<Integer> a) {
    // Write your code here
    int n =a.size();
    int minDist=-1;
     HashMap<Integer,Integer> distances = new HashMap<>();
     for(int i = 0; i < n; i++)
        {
            if(distances.containsKey(a.get(i)))
            {
                //Calculate distance between like numbers
                int distance = Math.abs(distances.get(a.get(i)) - i);
                
                if( distance < minDist || minDist == -1)
                {
                    minDist = distance;
                }
                
                //Set start point to the old end point
                distances.put(a.get(i), i);
            }
            else
            {
                //Add a new starting point
                distances.put(a.get(i), i);
            }
            System.out.println("distances : "+distances);
        }
        
        System.out.println(minDist);
    
   
    
return minDist;
    }