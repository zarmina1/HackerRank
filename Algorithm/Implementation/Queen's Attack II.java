public static int queensAttack(int n, int k, int r, int c, List<List<Integer>> obstacles) {
    // Write your code here
 
     HashMap<Integer, HashSet<Integer>> cache = new HashMap<>();
    for (int i = 0; i < obstacles.size(); i++) {
      if (cache.containsKey(obstacles.get(i).get(0))) {
        cache.get(obstacles.get(i).get(0)).add(obstacles.get(i).get(1));
      } else {
        cache.put(obstacles.get(i).get(0), new HashSet<Integer>());
        cache.get(obstacles.get(i).get(0)).add(obstacles.get(i).get(1));
      }
    }
   int counter = 0;
    // right
    for (int i = c + 1; i <= n; i++) {
      if (cache.containsKey(r) && cache.get(r).contains(i)) {
        break;
      }
      counter++;
    }

    // left
    for (int i = c - 1; i >= 1; i--) {
      if (cache.containsKey(r) && cache.get(r).contains(i)) {
        break;
      }
      counter++;
    }

    // down
    for (int i = r + 1; i <= n; i++) {
      if (cache.containsKey(i) && cache.get(i).contains(c)) {
        break;
      }
      counter++;
    }

    // up
    for (int i = r - 1; i >= 1; i--) {
      if (cache.containsKey(i) && cache.get(i).contains(c)) {
        break;
      }
      counter++;
    }

    // up-left
    for (int i = r - 1, j = c - 1; i >= 1 && j >= 1; i--, j--) {
      if (cache.containsKey(i) && cache.get(i).contains(j)) {
        break;
      }
      counter++;
    }

    // up-right
    for (int i = r - 1, j = c + 1; i >= 1 && j <= n; i--, j++) {
      if (cache.containsKey(i) && cache.get(i).contains(j)) {
        break;
      }
      counter++;
    }

    // down-right
    for (int i = r + 1, j = c + 1; i <= n && j <= n; i++, j++) {
      if (cache.containsKey(i) && cache.get(i).contains(j)) {
        break;
      }
      counter++;
    }

    // down-left
    for (int i = r + 1, j = c - 1; i <= n && j >= 1; i++, j--) {
      if (cache.containsKey(i) && cache.get(i).contains(j)) {
        break;
      }
      counter++;
    }

    return counter;
    }