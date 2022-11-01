 public static int beautifulTriplets(int d, List<Integer> arr) {
    // Write your code here
  HashMap<Integer,Integer> h = new HashMap<>();
  for (int i = 0; i < arr.size(); i++) {
      if (h.containsKey(arr.get(i))) {
        h.put(arr.get(i), h.get(arr.get(i)) + 1);
      } else {
        h.put(arr.get(i), 1);
      }
    }
     int counter = 0;
    // i < j < k
    // find = d + a[i]
    for (int i = 0; i < arr.size(); i++) {
      if (i == 0 || arr.get(i) != arr.get(i-1)) {
        int j = d + arr.get(i);
        int k = d + j;
        if (h.containsKey(j) && h.containsKey(k)) {
          counter += h.get(arr.get(i)) * h.get(j) * h.get(k);
        }
      }
    }

    return counter;
  
    }
