 public static void plusMinus(List<Integer> arr) {
    // Write your code here
        float positiveCount = 0;
        float negativeCount = 0;
        float zeroCount = 0;
        
        int n=arr.size();
        for (int i = 0; i < n; i++) {
            if (arr.get(i) > 0) {
                positiveCount++;
            }
            else if (arr.get(i) < 0) {
                negativeCount++;
            }
            else if (arr.get(i) == 0) {
                zeroCount++;
            }
        }
         System.out.printf("%1.6f ", positiveCount / n);
         System.out.println();
        System.out.printf("%1.6f ", negativeCount / n);
        System.out.println();
        System.out.printf("%1.6f ", zeroCount / n);
        System.out.println();
    }