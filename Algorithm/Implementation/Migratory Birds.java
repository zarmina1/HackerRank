public static int migratoryBirds(List<Integer> arr) {
    // Write your code here
    int n=arr.size();
    
    int [] temp =new int[5];
    for(int i=0;i<n;i++){
        switch(arr.get(i)){
            case 1:
            temp[0]++;
            break;
            case 2:
            temp[1]++;
            break;
            case 3:
            temp[2]++;
            break;
            case 4:
            temp[3]++;
            break;
            case 5:
            temp[4]++;
            break;
        }
        
    }
    int highest=0;
    int result=0;
    for(int i=0;i<5;i++){
        if(temp[i]>highest){
            highest=temp[i];
            result=i+1;
        }
    }
    return result;
    }
