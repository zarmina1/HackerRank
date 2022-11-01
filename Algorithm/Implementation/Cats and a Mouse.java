static String catAndMouse(int x, int y, int z) {
       String result="";
       
       int aDiff=0;
       if(z<x){
           aDiff=x-z;
       }else{
           aDiff=z-x;
       }
        int bDiff=0;
       if(z<y){
           bDiff=y-z;
       }else{
           bDiff=z-y;
       }
       if(aDiff<bDiff){
           result= "Cat A";
        }else if(bDiff<aDiff){
           result= "Cat B";
         }else if(aDiff==bDiff){
           result= "Mouse C";
             }
return result;
    }
