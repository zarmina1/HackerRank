 public static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
        
     List<Integer> result = new ArrayList<Integer>(2); 
     int avalue=0;
     int bvalue=0;
     for(int i=0;i<a.size();i++){
         
       
             if(a.get(i)>b.get(i)){
             avalue++;
             System.out.println(avalue);
             
             
            
         }else if(a.get(i)<b.get(i)){
               bvalue++;
               System.out.println(bvalue);
              
             
           
         }else if( a.get(i) == b.get(i)){
            continue;
         }
         
         
     }
     result.add(avalue);
     result.add(bvalue);
     return result;
     
    }