 public static String encryption(String s) {
    // Write your code here
     int size=s.length();
     int rows= (int) Math.sqrt(size);
     int columns=(size > rows*rows)?rows+1:rows;
     String Result="";
     rows=(size> rows*columns) ? rows+1 : rows;
      for(int i = 0; i < columns; i++)
        {
            //System.out.print(sentence.charAt(i));
            int currentIndex = i;
            for(int j = 0; j < rows; j++)
            {
                if(currentIndex <= size-1)
                {  Result+=s.charAt(currentIndex);
                   System.out.print(s.charAt(currentIndex));
                }
                currentIndex += columns;
            }
            if(i+1 != columns) {
                Result+=" ";
                System.out.print(" ");
                }
        }
       return Result; 
    }