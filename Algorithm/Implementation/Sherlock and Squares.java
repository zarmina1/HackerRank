  public static int squares(int a, int b) {
    // Write your code here
    int start = (int) Math.sqrt(a); //Finds our starting squareInteger
    int end = (int) Math.sqrt(b);   //Finds our ending squareInteger
    int squareIntegers = end-start; //Calculates the squareIntegers between them
    squareIntegers += (Math.pow(start,2) >= a) ? 1 : 0; 
    System.out.println(squareIntegers);
    return squareIntegers;
    }