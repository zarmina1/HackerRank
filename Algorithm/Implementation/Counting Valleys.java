  public static int countingValleys(int steps, String path) {
    // Write your code here
     int level=0;
     int valley=0;
     boolean belowSea=false;
 for(int i=0;i<steps;i++){
     if(path.charAt(i)=='U'){
         level++;
     }else{
         level--;
     }
    if(!belowSea && level < 0){
            valley++;
            belowSea = true;
    }
            
    if(level >= 0)//We are back above sea level
                belowSea = false;
        }
     
 return valley;
    }