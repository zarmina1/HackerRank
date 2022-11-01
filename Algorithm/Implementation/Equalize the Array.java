   public static int equalizeArray(List<Integer> arr) {
    // Write your code here
    int n=arr.size();
    int itemsToDelete = 0;
    int highestFrequency = 1;
        HashMap<Integer, Integer> numberFrequency = new HashMap<>();
        
        for(int i = 0; i < n; i++)
        {
            int curr = arr.get(i);
            
            if(numberFrequency.get(curr) == null)
            {
                numberFrequency.put(curr, 1);
            }
            else
            {
                int newFrequency = numberFrequency.get(curr) + 1;
                
                numberFrequency.put(curr, newFrequency);
                highestFrequency = (newFrequency > highestFrequency) ? newFrequency : highestFrequency;
            }
        }
        
        itemsToDelete = n - highestFrequency;
        
        System.out.println(itemsToDelete);
     
     return itemsToDelete;
     
    }