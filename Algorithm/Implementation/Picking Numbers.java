private static List<Integer> findValidSubarray(final List<Integer> array, final Integer integer) {
    final List<Integer> subarray = new ArrayList<Integer>();
    //for-each loop
    for (int elem : array) {
         if ((elem == integer) || (elem + 1 == integer)) {
             subarray.add(elem);
         }
    }
    return subarray;
}
    public static int pickingNumbers(List<Integer> a) {
    // Write your code here
     int maxLength = 0;
    List<Integer> subarray = new ArrayList<Integer>();

    for (int i = 0; i < a.size(); i++) {
        subarray = findValidSubarray(a, a.get(i));
        if ((subarray.size() > maxLength)) {
            maxLength = subarray.size();
        }
    }
    return maxLength;

}