public static int saveThePrisoner(int n, int m, int s) {
    // Write your code here
         int poisonedPrisoner = (s + m - 1) % n;
         if(poisonedPrisoner == 0){
            poisonedPrisoner=n;
            }
        System.out.println(poisonedPrisoner);
        return poisonedPrisoner;
    }