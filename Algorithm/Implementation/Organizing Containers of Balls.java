public static String organizingContainers(List<List<Integer>> container) {
    // Write your code here
    int n=container.size();
    String Result="";
    LinkedList<Integer> containers = new LinkedList<>();
    LinkedList<Integer> balls = new LinkedList<>();
    for(int i=0;i<n;i++){
     int rowSum = 0;
                int colSum = 0;
                for(int j = 0; j < n; j++){
                    rowSum += container.get(i).get(j); 
                    colSum +=container.get(j).get(i); ;
                }
                balls.add(colSum);
                containers.add(rowSum);
    
    
}
containers.removeAll(balls);
            if(containers.isEmpty()){
                Result="Possible";
                System.out.println("Possible");
            }else{ 
                Result="Impossible";
                System.out.println("Impossible");}
                return Result;
    }