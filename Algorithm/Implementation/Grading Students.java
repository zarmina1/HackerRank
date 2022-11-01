public static List<Integer> gradingStudents(List<Integer> grades) {
    // Write your code here
    int n=grades.size();
    for(int i=0;i<n;i++){
       if(grades.get(i)>=38){
         int nextMultipleOfFive = 5 - (grades.get(i) % 5) + grades.get(i);
         if (nextMultipleOfFive - grades.get(i)< 3) {
            grades.set(i, nextMultipleOfFive);
         }
        }
     }
return grades;
    }