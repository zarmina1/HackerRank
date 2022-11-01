public static String angryProfessor(int k, List<Integer> a) {
    // Write your code here
int n=a.size();
int onTime=0;
for(int i=0;i<n;i++){
    if(a.get(i)<=0){
       onTime++;
    }
}
String result="";
 if(onTime>=k){
    result="NO";
}else{
    result="YES";
}
return result;
    }