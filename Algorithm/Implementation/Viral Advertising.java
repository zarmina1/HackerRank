public static int viralAdvertising(int n) {
    // Write your code here
int shared=5;
int liked=shared/2;
Math.floor(liked);
int cumulative=liked;

for(int i=1;i<n;i++){
    shared=liked*3;
    liked=shared/2;
    cumulative=liked+cumulative;
    
}
return cumulative;
    }