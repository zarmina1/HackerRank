 public static List<Integer> circularArrayRotation(List<Integer> a, int k, List<Integer> queries) {
    // Write your code here
    int n=a.size();
    int q=queries.size();
    k = k%n;
    System.out.println("k:"+k);
    List<Integer> temp=new ArrayList<>(queries.size());   
    for(int j = 0; j < q; j++){
            int m = queries.get(j);
             System.out.println("m:"+m);
            if(m-k >=0)//Checks if a array wrap occurs
            {
                temp.add(j,a.get(m-k) );
                
            }
            else//if and array rap occurs we account for it
            {
                temp.add(j,a.get(n+(m-k)) );
               
            }
            
        }
   return temp;
    }