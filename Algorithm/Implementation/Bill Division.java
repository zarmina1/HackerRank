public static void bonAppetit(List<Integer> bill, int k, int b) {
    // Write your code here
    int sum=0;
    for(int i=0;i<bill.size();i++){
        if(i!=k){
           sum=sum+bill.get(i); 
        }
    }
    int acutalCost=sum/2;
    if(acutalCost==b){
        System.out.println("Bon Appetit");
    }else{
         System.out.println(b-acutalCost);
    }
    }