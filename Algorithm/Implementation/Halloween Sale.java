
    public static int howManyGames(int p, int d, int m, int s) {
    // Return the number of games you can buy

   int gamecount=0;
   while(s>=p){
    gamecount++;
    s-=p;
    if(p-d<m){
        p=m;
    }else{
       p-=d; 
    }
  }
return gamecount;
    }