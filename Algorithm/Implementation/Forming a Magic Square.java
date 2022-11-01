public static int formingMagicSquare(List<List<Integer>> s) {
   int[][][] ms = {
            { { 8, 1, 6 }, { 3, 5, 7 }, { 4, 9, 2 } },
            { { 6, 1, 8 }, { 7, 5, 3 }, { 2, 9, 4 } },
            { { 4, 9, 2 }, { 3, 5, 7 }, { 8, 1, 6 } },
            { { 2, 9, 4 }, { 7, 5, 3 }, { 6, 1, 8 } },
            { { 8, 3, 4 }, { 1, 5, 9 }, { 6, 7, 2 } },
            { { 4, 3, 8 }, { 9, 5, 1 }, { 2, 7, 6 } },
            { { 6, 7, 2 }, { 1, 5, 9 }, { 8, 3, 4 } },
            { { 2, 7, 6 }, { 9, 5, 1 }, { 4, 3, 8 } },
        };
 
        // If all the elements need to be changed,
        // there would be 9 changes, so we take the
        // max as 9
      int[][] arr = s.stream()
                          .map(l -> l.stream()
                               .mapToInt(Integer::intValue)
                               .toArray()
                              )
                          .toArray(int[][]::new);
       
     

        int minCost = Integer.MAX_VALUE;
        for (int permutation = 0; permutation < 8; permutation++) 
        {
            int permutationCost = 0;
            for (int i = 0; i < 3; i++) 
            {
                for (int j = 0; j < 3; j++)
                    permutationCost += Math.abs(arr[i][j] - ms[permutation][i][j]);
            }
            minCost = Math.min(minCost, permutationCost);
        }
        System.out.println(minCost);
        return minCost;
    }